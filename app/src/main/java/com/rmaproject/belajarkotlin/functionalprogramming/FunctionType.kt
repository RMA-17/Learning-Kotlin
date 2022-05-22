package com.rmaproject.belajarkotlin.functionalprogramming

/*

Function Type

Pada sub-modul selanjutnya, kita akan belajar tentang lambda dan higher-order function,
namun sebelum itu kita perlu tahu terlebih dahulu apa itu function type.
Seperti namanya, Anda dapat membuat sebuah fungsi menjadi tipe data. Menarik kan?

Kotlin sendiri menggunakan function type untuk tipe deklarasi yang berhubungan dengan sebuah fungsi.
Dalam penggunaannya, terdapat beberapa tanda yang berhubungan dengan sebuah fungsi
seperti jumlah dan tipe parameter serta tipe kembalian.

(Int, Int) -> String

Setiap function type memiliki tanda kurung. Di dalamnya terdapat sebuah parameter
dan jumlah tipe yang menandakan jumlah parameter dari fungsi tersebut. Pada contoh di atas,
fungsi tersebut memiliki 2 (dua) parameter dengan tipe Int dan memiliki tipe kembalian String.
Ketika kita tidak ingin fungsi tersebut mengembalikan nilai, kita bisa menggunakan Unit.
Berbeda dengan fungsi pada umumnya, jika menggunakan tipe kembalian Unit, kita tidak wajib menuliskannya.

seperti ini:
(Int, Int) -> Unit

*/

/*

Ketika kita mempunyai beberapa fungsi yang memiliki function type yang sama,
kita bisa menyederhanakannya. Bagaimana caranya? Manfaatkan kata kunci typealias
untuk memberikan nama alternatif dari sebuah function type seperti berikut:


typealias cocok digunakan ketika kita mempunyai sebuah function type yang panjang.
Dengannya, kita bisa memberikan nama untuk sebuah function type dan menggunakannya
sebagai tipe untuk fungsi lainnya.
*/

//Jadi function type bisa disamarkan menjadi tipedata/dijadikan seperti variable dengan typealias.

typealias Arithmetic = (Int, Int) -> Int

val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

/*

Untuk membuat instance dari sebuah function type, terdapat beberapa cara.
Salah satunya dengan lambda expression yang sudah kita bahas pada sub-modul sebelumnya.
Sedangkan untuk menggunakan instance-nya, kita bisa memanfaatkan operator invoke() seperti berikut:

*/

val sumResult = sum.invoke(10, 10)
val multiplyResult = multiply.invoke(20, 20)

//Atau kita bisa menuliskannya secara langsung dengan menghilangkan operator invoke():
//val sumResult = sum(10, 10)
//val multiplyResult = multiply(20, 20)

/*
Kita juga bisa menandai function type sebagai nullable dengan menempatkannya
di dalam tanda kurung dan diakhiri dengan safe call seperti berikut:
*/

typealias Arithmetica = ((Int, Int) -> Int)?
//untuk instance nya sama saja.
val sums: Arithmetica = { valueA, valueB -> valueA + valueB }

//Berikut adalah contoh penggunaan function type yang ditandai sebagai nullable:
val testSum = sums?.invoke(10, 10)