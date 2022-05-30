package com.rmaproject.belajarkotlin.coroutines

import kotlinx.coroutines.*


/*
Coroutine Dispatcher
Seperti yang sudah kita ketahui, coroutines berjalan di atas sebuah thread.
Tentunya kita harus mengetahui thread mana yang akan digunakan untuk menjalankan
dan melanjutkan sebuah coroutine. Untuk menentukannya kita membutuhkan sebuah base class
bernama CoroutineDispatcher. Di dalam kelas tersebut kita akan menemukan beberapa objek yang
nantinya bisa digunakan untuk menentukan thread yang berfungsi menjalankan coroutines.
*/

fun main():Unit = runBlocking<Unit> {

    /*

    Dispatcher.Default

    Merupakan dispatcher dasar yang digunakan oleh semua standard builders seperti
    launch, async, dll jika tidak ada dispatcher lain yang ditentukan.
    Dispatcher.Default menggunakan kumpulan thread yang ada pada JVM.
    Pada dasarnya, jumlah maksimal thread yang digunakan adalah sama dengan jumlah core dari CPU.

    Untuk menggunakannya, Anda cukup menggunakan coroutines builder
    tanpa harus menuliskan dispatcher secara spesifik:
    */
    launch {
    }

    //Atau bisa juga:
    launch (Dispatchers.Default) {

    }

    //Kedua nya sama-sama di thread default

    /*
    Dispatcher.IO
    Sebuah dispatcher yang dapat digunakan untuk membongkar pemblokiran operasi I/O.
    Ia akan menggunakan kumpulan thread yang dibuat berdasarkan permintaan.
    Anda bisa menerapkannya dengan menambahkan Dispatcher.IO pada coroutines builder:
    */

    launch(Dispatchers.IO) {

    }

    /*
    Dispatcher.Unconfined
    Dispatcher ini akan menjalankan coroutines pada thread yang sedang berjalan sampai mencapai titik penangguhan.
    Setelah penangguhan, coroutines akan dilanjutkan pada thread dimana komputasi penangguhan yang dipanggil.

    Sebagai contoh, ketika fungsi a memanggil fungsi b, yang dijalankan dengan dispatcher dalam thread tertentu,
    fungsi a akan dilanjutkan dalam thread yang sama dengan fungsi b dijalankan. Perhatikan kode berikut:
    */

    launch(Dispatchers.Unconfined) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()

    //Artinya, coroutine telah dimulai dari main thread, kemudian tertunda oleh fungsi delay selama 1 detik.
    //Setelah itu, coroutine dilanjutkan kembali pada thread DefaultExecutor.

    /*
    Bersamaan dengan objek-objek tersebut,
    ada beberapa builder yang dapat digunakan untuk menentukan thread yang dibutuhkan:
    */

    /*
    Single Thread Context

    Dispatcher ini menjamin bahwa setiap saat coroutine akan dijalankan pada thread yang Anda tentukan.
    Untuk menerapkannya, Anda bisa memanfaatkan newSingleThreadContext()seperti kode dibawah ini:
    */
    val dispatcher = newSingleThreadContext("mythread")
    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()

    //Artinya, coroutine telah dimulai dari thread yang ditentukan, kemudian tertunda oleh fungsi delay selama 1 detik.
    //Walaupun sudah menjalankan fungsi delay, coroutine akan tetap berjalan pada myThread.

    val poolDispatcher = newFixedThreadPoolContext(4, "poolThreads")
    launch(poolDispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()

    /*
    Pada kode di atas, kita telah menetapkan thread myPool sebanyak 3 thread.
    Runtime akan secara otomatis menentukan pada thread mana coroutine akan dijalankan dan dilanjutkan.
    Hasil dari kode tersebut adalah:

    Starting in myPool-1
    Resuming in myPool-2
    */

}