package com.rmaproject.belajarkotlin.oopprogramming

/*
Membuat Kelas

Untuk mendefinisikan kelas dalam Kotlin, Anda cukup gunakan kata kunci class
diikuti dengan nama kelas yang akan dibuat. Mari kita buat contoh kelas pada Kotlin:
*/


class AnimalReal(
    val name: String,
    val weight: Double,
    val age: Int,
    val isMammal: Boolean
) {

    fun eat() {
        println("$name makan !")
    }

    fun sleep() {
        println("$name tidur !")
    }
}

fun main() {
    //Lalu untuk membuat sebuah objek dari suatu kelas, Anda bisa perhatikan struktur kode berikut:
    val nameOfObject = AnimalReal("Kucing", 2.0, 1, true)


}