package com.rmaproject.belajarkotlin.oopprogramming

/*

Ketika suatu objek dibuat, semua properti pada kelas tersebut harus memiliki nilai.
Kita dapat langsung menginisialisasi pada properti tertentu atau menginisialisasinya melalui constructor (konstruktor).
Konstruktor merupakan fungsi spesial yang digunakan untuk menginisialisasi properti yang terdapat pada kelas tersebut.


Terdapat 2 (dua) tipe konstruktor pada Kotlin, yaitu primary constructor dan secondary constructor.
*/

fun main() {
    /*
    Primary Constructor
    Seperti namanya, jika kita akan membuat suatu objek dari sebuah kelas dan kelas tersebut
    memiliki primary constructor di dalamnya, maka kita diharuskan mengirim nilai sesuai properti
    yang dibutuhkan. Penulisan primary constructor mirip seperti parameter pada fungsi.
    */


}

class PrimaryConstructorTest(val name:String, val age:String)

class PrimaryConstructorTestInit(pName:String, age: String) {

    /*
    Kotlin menyediakan blok init yang memungkinkan kita untuk menuliskan properti di
    dalam body class ketika kita menggunakan primary constructor.
    Memang, memiliki kode banyak di dalam body class bukanlah hal yang baik.
    Kotlin bertujuan agar kita dapat menuliskan kode seminimal mungkin.

    Tapi blok init di sini memiliki beberapa fungsi selain menginisialisasi properti kelas.
    satu fungsi lainnya adalah untuk membantu dalam memvalidasi sebuah nilai properti
    sebelum diinisialisasi.
    */

    val name:String
    init {
        //init akan dijalankan saat pertama kali kita menginisiasikan class ini.
        name = pName

    }
    /*
    Primary constructor dan init harus saling terhubung.
    Fungsi init dijalankan ketika suatu objek dibuat dengan menggunakan primary constructor.
    Mari kita coba untuk membuatnya.
    */


    /*
    Kata kunci 'this' merujuk kepada suatu kelas dimana jika kita menggunakannya diikuti
    dengan nama properti maka kita menunjuk pada properti yang terdapat pada kelas tersebut.
    Dengan begitu, tidak akan ada ambiguitas walaupun kita menggunakan penamaan yang sama
    antara properti dan parameter primary constructor.
    */



}