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
    //Jika kita memanggil vararg number,
    //maka kita akan mendapatkan sebuah array of Int walaupun tipedatanya adalah Int atau String biasa.
    return number.sum()
}

//Selain itu kita juga bisa menerapkan Generic untuk tipe parameter ketika parameter tersebut ditentukan dengan vararg.
//Contohnya seperti berikut:

fun <T> asList(vararg input: T): List<T> {
    val result = ArrayList<T>()
    for (item in input)
        result.add(item)
    return result
}

/*
Ketika sebuah parameter ditentukan dengan vararg, pada dasarnya semua argumen yang dilampirkan,
ditampung di dalam sebuah Array <out T>. Contohnya bisa kita lihat pada contoh kode di atas.
*/


fun main() {
    val numberArray = arrayOf(1, 2, 3, 4, 5)
    val numbers = sumNumbers(1, 2, 3, 4, 5, *numberArray.toIntArray())
    println(numbers) // 15
    //Intinya kita bisa menaruh banyak argumen di dalam fungsi dengan 1 parameter secara sekaligus.
    val number = asList(1, 2, 3, 4, 5)
    println(number) // [1, 2, 3, 4, 5]
}

/*
Lalu kapan kita membutuhkan vararg?

Ketika sebuah fungsi yang menggunakannya tidak mengetahui jumlah argumen yang akan disematkan ketika fungsi tersebut dipanggil.
Contoh penerapan bisa kita liat pada fungsi String.format(),  di mana fungsi tersebut terdapat parameter yang ditandai
dengan vararg dan dapat disematkan beberapa argumen tanpa harus tahu batasannya.
*/

/*
Aturan pada Vararg Arguments

Dalam penggunaannya, terdapat aturan yang perlu kita ketahui.
- Pertama, di dalam sebuah fungsi, tidak diizinkan untuk memiliki 2 (dua) parameter bertanda vararg.

fun sumNumbers(vararg number: Int, vararg number2: Int)

Ketika kode di atas dijalankan, proses kompilasi akan gagal dengan log eror sebagai berikut:
Kotlin: Multiple vararg-parameters are prohibited

- jika kita ingin menambahkan parameter baru tanpa kata kunci vararg,
parameter yang ditandai dengan vararg sebaiknya berada pada posisi terakhir.
Contohnya seperti berikut:

fun main() {
    sets("Kotlin", 10, 10)
}

fun sets(name: String, vararg number: Int): Int {
    ...
}

Lalu bagaimana jika kita ingin menempatkan parameter yang ditandai vararg bukan pada posisi pertama?
Kita bisa mendefinisikannya secara langsung. Namun berbeda saat fungsi tersebut dipanggil
di mana kita harus menggunakan named argument saat ingin melampirkan argumen untuk
parameter yang tidak ditandai dengan vararg. Contohnya seperti berikut:

fun main() {
    sets(10, 10, name = "Kotlin")
    //Jadi jika mau mengisi parameter yang ditandai dengan vararg didepannya,
    kita bisa menggunakan named argument untuk mengisi parameter selainnya.
}

fun sets(vararg number: Int, name: String): Int {
    ...
}

Kenapa demikian? Saat kita tidak menandai argumen tersebut untuk parameter yang mana,
kompiler akan menetapkan jika argumen tersebut untuk parameter yang ditandai dengan vararg.

*/

/*
Beda VarArg dengan Array<T>

Karena semua argumen ditampung di dalam sebuah Array, maka akan muncul pertanyaan,
"Apa bedanya ketika kita menggunakan Array<T> sebagai tipe parameter?" Misal seperti berikut:

fun sets(number: Array<Int>){
    ...
}

Dari sini kita bisa lihat langsung letak perbedaannya di mana. Ketika fungsi di atas dipanggil,
fungsi tersebut membutuhkan argumen berupa nilai yang sudah berbentuk Array seperti berikut:

fun main() {
    val number = arrayOf(10, 20, 30, 40)
    sets(number)
}

fun sets(number: Array<Int>) {
    ...
}

Berbeda ketika kita menggunakan vararg. Kita bisa memasukkan argumen satu persatu.
Lalu apakah bisa kita memasukkan nilai yang sudah berbentuk Array sebagai argumen untuk parameter yang ditandai dengan vararg?

Tentu bisa! Dengan memanfaatkan spread operator (*) seperti berikut:

fun main() {
    val number = intArrayOf(10, 20, 30, 40)
    sets(10, 20, 20, *number , 10)
}

fun sets(vararg number: Int): Int {
    ...
}

Dalam penggunaannya, spread operator ditempatkan sebelum nama variabel yang ingin dilampirkan.

Seperti SQL cokkk


*/