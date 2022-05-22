package com.rmaproject.belajarkotlin.functionalprogramming

/*
    Named Argument

    Di beberapa kasus pembuatannya, sebuah fungsi bisa menjadi cukup kompleks dengan banyaknya parameter.
    Alhasil saat ingin memanggil fungsi tersebut, kita harus menghafal posisi dari parameter agar tidak salah dalam melampirkan sebuah argumen.

    Untuk mengatasi hal ini Kotlin menawarkan sebuah cara.
    Dengan ini, kita tak perlu lagi menghafal posisi dari sebuah parameter.
    Karena ketika sebuah fungsi dipanggil, kita bisa menentukan argumen dari parameter mana yang ingin dilampirkan dengan memanggil nama dari parameter tersebut.
    Misalnya kita mempunyai sebuah fungsi seperti berikut:
*/
fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}

/*
    Default Argument

    Tidak sampai di situ, Kotlin juga memungkinkan kita untuk menentukan nilai default dari sebuah parameter.
    Jika kita melewatkan argumen untuk dilampirkan, maka nilai default tersebut lah yang akan digunakan.

    Untuk menambahkan nilai default itu sendiri pun cukup mudah,
    yaitu dengan cara menempatkannya langsung tepat di samping dari parameter seperti halnya ketika ingin menginisialisasikan sebuah nilai untuk variabel.
    Contohnya seperti berikut:
*/

//Kita bisa memanggil fungsi di atas seperti biasanya. Tetapi karena parameternya sudah memiliki nilai,
//maka argumen untuk fungsi tersebut bisa dilewatkan ketika dipanggil.
fun getFullName2(
first: String = "Kotlin",
middle: String = " is ",
last: String = "Awesome"): String {
    return "$first $middle $last"
}

fun main() {
    //Nah, dengan memanfaatkan named argument, kita bisa menuliskannya seperti di bawah ini:
    println(getFullName(first = "Johan", middle = "Wilheim", last = "Liebert"))

    //Menariknya lagi, kita bisa mengubah posisi dari argumen ketika dilampirkan, misalnya seperti ini:
    println(getFullName(last = "Liebert", middle = "Wilheim", first = "Johan"))
}