package com.rmaproject.belajarkotlin.coroutines

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() : Unit = runBlocking(CoroutineName("main")) {
    /*
    Channels adalah bagaimana 2 atau lebih coroutines berinteraksi

    Beberapa masalah yang muncul pada concurrency seperti deadlock, race conditions, dan lainnya,
    sering kali dipicu oleh satu hal, apa itu? Rupanya problem pembagian memori atau sumber
    daya antar thread. Untuk mengatasinya, banyak programming language
    seperti Go, Dart, dan juga Kotlin telah menyediakan channels.
    */

    val channel = Channel<Int>()

    launch(CoroutineName("v1coroutine")) {
        println("Sending from ${Thread.currentThread().name}")
        for (x in 1..5) channel.send(x)
    }

    repeat(5) { println(channel.receive())}
    println("received in ${Thread.currentThread().name}")

    channel.close()


}