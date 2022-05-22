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
Untuk mendeklarasikan sebuah extension functions, kita perlu menentukan terlebih dahulu receiver type
kemudian nama dari fungsi tersebut yang mana keduanya dipisahkan oleh titik (.). Contohnya, seperti berikut:
*/

fun Int.convertToString() : String {
    return "OOOOMAGAAAA $this"  //$this adalah sebuah variable yang berisi nilai dari receiver type
}

fun main() {
    val number = 1
    print(number.convertToString()) // <- OOOOMAGAAAA 1

    print(number.slice)

}

/*
Extension Properties

Selanjutnya adalah extension properties. Seperti yang disebutkan di awal,
Kotlin juga mendukung extension untuk menambah sebuah properti
baru pada sebuah kelas tanpa harus menyentuh kode di dalam kelas tersebut.

*/

// Deklarasinya pun sama seperti extension functions. Kita terlebih dahulu menentukan receiver type
// kemudian nama dari properti tersebut. Contoh seperti berikut:
// bedanya dengan functional extension, extension properties menggunakan val atau var.

val Int.slice: Int
//get() adalah getter properti, yg berarti mengambil nilai dari properti tersebut
    get() {
        return this % 10
    }

/*

Yang perlu diketahui, extension tidak benar-benar mengubah sebuah kelas dengan menambahkan
sebuah fungsi atau properti baru. Ini karena extension memiliki hubungan langsung dengan kelas yang
ingin diperluas fungsionalitasnya. Sehingga extension properties hanya bisa dideklarasikan dengan
cara menyediakan getter atau setter secara eksplisit.

*/

