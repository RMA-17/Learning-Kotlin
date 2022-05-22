package com.rmaproject.belajarkotlin.functionalprogramming


/*
Kotlin memungkinkan kita untuk menambahkan sebuah fungsi baru pada sebuah kelas tanpa harus mewarisi kelas tersebut.
Misal kita ingin menambahkan fungsi baru untuk kelas Int, maka kita akan menuliskannya seperti berikut:
*/

//class NewInt : Int(){   // <- class seperti Int, String, Boolean adalah final, tidak bisa di inherit atau diwariskan
//    fun printInt(){
//        println("value $this")
//    }
//}

//Untuk itu, kita bisa melakukannya dengan deklarasi khusus yang disebut dengan Extensions.

/*
Kotlin mendukung 2 (dua) extension yang dapat digunakan, yaitu Extension Functions dan Extension Properties.
Jika extension functions digunakan untuk menambahkan fungsi baru,
extension properties tentunya digunakan untuk menambahkan sebuah properti baru.
*/

/*
Extension Functions
Untuk mendeklarasikan sebuah extension functions, kita perlu menentukan terlebih dahulu receiver type, kemudian nama dari fungsi tersebut yang mana keduanya dipisahkan oleh titik (.). Contohnya, seperti berikut:
*/

fun main() {

}