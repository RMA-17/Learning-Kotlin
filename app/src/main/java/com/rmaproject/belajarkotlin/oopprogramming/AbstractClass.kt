package com.rmaproject.belajarkotlin.oopprogramming

/*
Abstract Class

Seperti namanya, abstract merupakan gambaran umum dari sebuah kelas.
Ia tidak dapat direalisasikan dalam sebuah objek.
Pada sub-modul sebelumnya kita sudah mempunyai kelas Animal.
Secara harfiah hewan merupakan sebuah sifat. Kita tidak tahu bagaimana objek hewan tersebut.
Kita tahu bentuk kucing, ikan dan ular seperti apa tetapi tidak untuk hewan.
Maka dari itu konsep abstract class perlu diterapkan agar kelas Animal tidak dapat
direalisasikan dalam bentuk objek namun tetap dapat menurunkan sifatnya kepada child class-nya.
*/

//Jadi abstract class ini bisa diturunkan, hanya saja tidak bisa dipanggil sebagai object.

/*
Untuk menjadikan sebuah kelas abstract,
kita hanya perlu menambahkan keyword abstract sebelum menuliskan nama kelas
*/

abstract class Benda(val kepadatan:Int) {
    fun melayang() : Boolean {
        return when (kepadatan) {
            0 -> true
            1 -> true
            else -> false
        }
    }
}

/*

Ketika kita mencoba membuat objek dari kelas abstract, akan terdapat eror berikut:

Cannot create an instance of an abstract class

*/