package com.rmaproject.belajarkotlin.coroutines

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    //Job dapat diinisialisasikan menggunakan fungsi launch() maupun Job() seperti berikut:

    //menggunakan launch():
//    fun main() = runBlocking {
//        val job = launch {
//            // Do background task here
//        }
//    }

//    //menggunakan Job():
//    fun main() = runBlocking {
//        val job = Job()
//    }

    /*
    Setelah diinisialisasikan, job akan memiliki state New dan akan langsung dijalankan.
    Jika Anda ingin membuat sebuah job tanpa langsung menjalankannya,
    Anda bisa memanfaatkan CoroutineStart.LAZY seperti berikut:
    */
    val job = launch(start = CoroutineStart.LAZY) {
        TODO("Not implemented yet!")
    }

//    Dengan begitu job tersebut bisa dijalankan saat nanti dibutuhkan.

}