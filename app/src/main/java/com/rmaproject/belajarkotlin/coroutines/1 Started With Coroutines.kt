package com.rmaproject.belajarkotlin.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    launch {
        delay(1000L)
        println("Coroutine")
    }
    println("Hello")

    delay(2000L)
}

/*

Kode di atas menggambarkan bagaimana coroutines bekerja.
Kita menggunakan fungsi runBlocking untuk memulai coroutine utama dan launch untuk menjalankan coroutine baru.
Jika Anda menjalankan program tersebut,maka konsol akan menampilkan hasil ini:

Hello,
Coroutines!

Fungsi delay(1000L) di dalam launch digunakan untuk menunda kode berikutnya selama 1 detik.
delay adalah fungsi yang spesial pada coroutines. Ia merupakan sebuah suspending function yang
tidak akan memblokir sebuah thread.

Selama proses penundaan tersebut, main thread akan terus berjalan sehingga fungsi println("Hello,")
akan langsung dijalankan. Setelah 1 detik, baru fungsi println("Coroutines!") akan dijalankan.
Sedangkan kode delay(2000L) digunakan untuk menunda selama 2 detik sebelum JVM berakhir.
*/