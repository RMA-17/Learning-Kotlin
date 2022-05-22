package com.rmaproject.belajarkotlin.functionalprogramming

/*

Lambda with receiver

Setelah mengetahui bagaimana cara mendeklarasikan dan menggunakan lambda,
selanjutnya kita akan mempelajari bagaimana lambda dideklarasikan dengan receiver.
Konsep ini digunakan sebagai dasar Kotlin untuk digunakan sebagai Domain Specific Languages (DSL).

*/

/*

Apa itu DSL? DSL adalah sebuah bahasa komputer yang dikhususkan untuk domain aplikasi tertentu.
Ia berbeda dengan general-purpose language yang bisa diterapkan di semua domain aplikasi.
Dengan DSL, kita bisa menuliskan kode lebih ringkas dan ekspresif.
Contoh sistem yang menerapkan DSL adalah Gradle dan sistem database yang berbasis SQL.

*/

fun buildString(): String {
    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello ")
    stringBuilder.append("from ")
    stringBuilder.append("lambda")
    return stringBuilder.toString()
}

/*

Kode di atas merupakan contoh kode StringBuilder yang digunakan untuk menambahkan kata satu per satu.
Jika dilihat kode ini cukup panjang tidak fleksibel.

Jika Anda ingin membuat menambahkan kata baru harus di dalam kode tersebut dan mengulang-ulang kata stringBuilder.
Dengan menggunakan DSL, Anda dapat menyingkat kode tersebut dan cukup fokus pada fungsi append-nya saja.
Berikut adalah contoh membuat Lambda with Receiver:

*/

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

/*

Pada kode di atas, StringBuilder dijadikan sebagai receiver untuk tipe deklarasi parameter action.
Dengan begitu kita dapat memanggil parameter action tersebut dari variabel yang bertipekan StringBuilder.
Untuk memanggil fungsi di atas bisa seperti berikut:

*/


fun main() {

    val message = buildString {

        //Karena di dalam kode ini kita menggunakan receiver StringBuilder (action:StringBuilder.)
        //maka kita dapat menggunakan append() langsung tanpa StringBuilder.

        append("Hello ")
        append("from ")
        append("lambda")
    }

    println(message)

    //NB:
    //Ini merupakan salah satu konsep dasar untuk membuat kode yang lebih simpel seperti yang diterapkan pada Gradle KTS dan Jetpack Compose.
}