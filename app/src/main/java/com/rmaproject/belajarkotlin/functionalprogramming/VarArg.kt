package com.rmaproject.belajarkotlin.functionalprogramming

/*
Vararg (Variable Argument)
Selain named dan default argument, Kotlin juga memiliki vararg (variable argument).
Dengan menggunakan kata kunci vararg kita juga bisa menyederhanakan beberapa parameter yang memiliki tipe data yang sama menjadi parameter tunggal.
*/

//Dengan  vararg sebuah fungsi dapat memiliki jumlah parameter berdasarkan jumlah argumen
//yang kita masukkan ketika fungsi tersebut dipanggil.
//Contoh dari penggunaan vararg adalah sebagai berikut:

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

//Selain itu kita juga bisa menerapkan Generic untuk tipe parameter ketika parameter tersebut ditentukan dengan vararg. Contohnya seperti berikut:

fun main() {
    val numbers = sumNumbers(1, 2, 3, 4, 5)
    println(numbers) // 15
    //Intinya kita bisa menaruh banyak argumen di dalam fungsi dengan 1 parameter secara sekaligus.


}