package com.rmaproject.belajarkotlin.oopprogramming


/*
    Seperti yang telah dijelaskan dalam pembahasan objek, Class merupakan sebuah blueprint.
    Di dalam kelas ini kita mendefinisikan sesuatu yang merupakan attribute ataupun behaviour.
    Contohnya pada sebuah kelas Kendaraan, atributnya berupa roda, warna, nomor kendaraan, merk, dll.
    Sedangkan untuk behaviour nya yaitu maju, mundur, belok kanan, belok kiri, berhenti.
    Contoh lainnya pada sebuah kelas Hewan atributnya berupa nama, berat, umur,
    termasuk mamalia atau bukan dll.

    Sedangkan untuk behaviour-nya bisa makan, tidur, berjalan, dsb.
    */

/*
Setiap kelas memiliki atribut dan behaviour.
Dalam Kotlin attributes lebih sering disebut dengan properties,
sedangkan behaviour sering disebut functions. Properti dalam sebuah kelas memiliki tipe data.
Contoh, untuk properti berat pada kelas Hewan dapat bertipe Double, nama dapat bertipe String,
umur dapat bertipe Int dan indikasi mamalia dapat bertipe Boolean.
Jika kelas Hewan kita representasikan dalam bentuk tabel maka akan terlihat seperti:
*/

class Animal (
    //Properties
    val name:String,
    val weight: Double,
    val age: Int,
    val isMamalia: Boolean
) {
    //Function/behaviour
    fun eat() {
        println("$name sedang makan")
    }

    fun sleep() {
        println("$name sedang tidur")
    }

    fun run() {
        println("$name sedang berjalan")
    }
}

/*

Pada pembahasan selanjutnya kita akan mencoba membuat sebuah kelas berdasarkan bentuk tabel di atas.
Namun sebelum kita lanjut ke pembahasan berikutnya, mari kita tekankan kembali ke
beberapa hal yang sudah kita pelajari:

- Class: Merupakan sebuah blueprint yang terdapat properti dan fungsi di dalamnya

- Properties: Karakteristik dari sebuah kelas, memiliki tipe data.

- Functions: Kemampuan atau aksi dari sebuah kelas.
*/