package com.rmaproject.belajarkotlin.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    /*
    Pada dasarnya, nilai deferred juga merupakan sebuah job.
    Ia diciptakan dan dimulai pada saat coroutines mencapai state active.
    Bagaimanapun, fungsi async juga memiliki opsional parameter seperti
    CoroutineStart.LAZY untuk memulainya.
    Dengan begitu, deferred juga bisa diaktifkan saat fungsi start, join, atau await dipanggil.
    */

    //contoh deferred:

    val capital = async { 123 }
    val income = async { 456 }

    println("Capital: ${capital.await()}")

    //capital dan income adalah contoh dari nilai deferred yang untuk mengaksesnya kita membutuhkan fungsi await.

}