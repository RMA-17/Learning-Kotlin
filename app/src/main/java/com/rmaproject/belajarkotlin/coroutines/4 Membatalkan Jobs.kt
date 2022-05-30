package com.rmaproject.belajarkotlin.coroutines

import kotlinx.coroutines.*

/*
Membatalkan Job
Ibarat pekerjaan di dunia nyata, sebuah job seharusnya bisa dibatalkan. Hanya job yang sedang aktif yang dapat dibatalkan.
Anda bisa melakukannya dengan memanggil fungsi cancel() seperti berikut:
*/

@InternalCoroutinesApi
fun main() = runBlocking {
    val job = launch {
        delay(5000)
        println("Start new job!")
    }

    delay(2000)
    job.cancel(cause = CancellationException("Time is up!"))
    println("Cancelling job...")
    if (job.isCancelled){
        println("Job is cancelled ${job.getCancellationException()}")
    }

    /*
    Kode di atas menggambarkan sebuah job membutuhkan waktu 5 detik untuk dijalankan.
    Namun ketika mencapai waktu 2 detik, job tersebut telah dibatalkan.
    Saat fungsi cancel() dipanggil, job akan memasuki state Cancelling sampai pembatalan tersebut berhasil.
    Kemudian setelah pembatalan berhasil, job akan memiliki state Cancelled dan Completed.

    Perlu diketahui bahwa jika cancel() dipanggil dalam job baru yang belum dijalankan,
    job tersebut tidak akan melalui state Cancelling, melainkan akan langsung memasuki state Cancelled.
    */

//    Kita juga bisa menambahkan parameter terhadap fungsi cancel(),
//    yaitu parameter cause yang bisa digunakan untuk memberitahu kenapa sebuah job dibatalkan.

    /*
    CancellationException akan mengirimkan nilainya sebagai pengecualian dari job tersebut.
    Kita pun bisa mengakses nilai tersebut dengan fungsi getCancellationException.
    Karena getCancellationException masih tahap eksperimen, Anda perlu menambahkan anotasi @InternalCoroutinesApi.
    */
}