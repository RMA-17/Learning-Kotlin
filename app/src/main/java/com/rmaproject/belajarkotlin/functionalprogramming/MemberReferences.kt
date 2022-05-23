package com.rmaproject.belajarkotlin.functionalprogramming


//Penggunaan lambda function:
val Testsum : (Int, Int) -> Int = { x, y -> x + y }

/*
Dengan Kotlin, kita bisa memisahkan lambda expression menjadi fungsi tersendiri dan
mereferensikannya langsung sebagai instance dari function type dengan cara seperti di bawah ini:
*/

val testSumms:(Int, Int) -> Int = ::count
fun count(x: Int, y: Int): Int {
    return x + y
}

/*
Kode di atas ditulis dengan mekanisme Reflection yang berarti seperangkat fitur bahasa dan library
yang memungkinkan kita untuk mengamati struktur kode
dari proyek yang sedang kita kerjakan secara langsung.
*/

// Jadi lambda testSumms tidak perlu di kasih sama dengan, kita bisa menggunakan langsung reflection
// ke function yang ada.

//function references
//Pada suatu kondisi, terkadang kita butuh mereferensikan sebuah fungsi.
// Sebagai contoh, misal kita memiliki fungsi seperti berikut:

fun isEvenNumber(number:Int) = number % 2 == 0

/*
Fungsi di atas digunakan untuk memeriksa apakah suatu angka merupakan sebuah bilangan genap.
Dengan menggunakan operator :: kita bisa menggunakannya sebagai instances dari function type.
Sebagai contoh, penggunaan fungsi filter() yang menjadi bagian dari kelas List berikut:
*/
fun Int.isEvenNumberExtension () = this % 2 == 0

var messageKotleen = "Kotleen"

fun main() {

    val number = 1.rangeTo(10)
    val evenNumber = number.filter(::isEvenNumber)

    //Cara memanggil refrection extension fuction.
    //NB: Ini juga berlaku untuk extension function.
    val evenNumberExtension = number.filter(Int::isEvenNumberExtension)

    println(evenNumber)

    /*
    Property References
    Selain digunakan untuk mereferensikan sebuah fungsi.
    Operator :: juga dapat digunakan untuk mereferensikan sebuah properti.
    Dengan Operator, kita bisa mengakses apa yang menjadi bagian dari properti tersebut seperti nama,
    fungsi setter getter, dll. Contohnya seperti berikut:
    */

    println(::messageKotleen.name)

    println(::messageKotleen.get())

    /*
    Ekspresi ::message akan dievaluasi ke dalam objek dengan KMutableProperty yang
    memungkinkan kita untuk membaca nilainya dengan menggunakan get(),
    menetapkan nilai menggunakan set() dan mendapatkan nama dari properti
    tersebut menggunakan properti name.

    Sedangkan untuk properti yang bersifat immutable seperti val message = “Kotlin”,
    ::message akan mengembalikan nilai dengan tipe KProperty,
    yang mana hanya terdapat fungsi get() di dalamnya.
    */
}