package com.rmaproject.belajarkotlin.functionalprogramming

/*

Ketika mengembangkan sebuah proyek, kita pasti membuat beberapa fungsi tersendiri dengan tujuan untuk memisahkan
logika program dari fungsi utama. Tujuannya adalah agar kode lebih terstruktur dan mudah dibaca.
Namun pada praktiknya, terkadang kode yang ada pada fungsi tersebut malah lebih panjang dan susah dibaca.
Salah satu penyebabnya adalah karena penulisan kode yang berulang atau lainnya.

Untuk mengatasinya, kita bisa memisahkannya lagi menjadi sebuah fungsi lokal (inner function)
dengan hak akses terbatas hanya untuk fungsi terluarnya. Ini bisa dilakukan karena pada Kotlin
kita bisa mendefinisikan sebuah fungsi di mana pun, bahkan di dalam sebuah fungsi (function inside function).

*/

//Contoh inner function:

fun setWord(message: String) {
    fun printMessage(text: String) {
        println(text)
    }

    printMessage(message)
}

/*
Mendefinisikan sebuah inner function sama halnya seperti kita mendefinisikan sebuah fungsi seperti biasanya.
Menariknya, kita bisa mengakses apa yang menjadi bagian fungsi terluarnya.
*/

//fungsi diatas bisa ditulis begini:

fun setWorldSimplified(message:String) {

    //inner function hanya bisa dipanggil setelah didefinisikan.
    fun printMessage() {
        println(message)
    }

    printMessage()

    //Selain itu, kita juga bisa menjadikan inner function sebagai extensions function.
    // Contohnya seperti berikut:

    fun String.printMessage() {
        println(this)
    }
}

fun main () {
    //Kita tidak bisa memanggil printMessage diluar fungsi setWord
}

