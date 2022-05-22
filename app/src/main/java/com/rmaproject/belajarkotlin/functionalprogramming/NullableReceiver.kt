package com.rmaproject.belajarkotlin.functionalprogramming

/*
Nullable Receiver

Menariknya, kita bisa juga mendeklarasikan sebuah extension dengan nullable receiver type.
Alhasil, extension tersebut bisa dipanggil pada objek yang bahkan nilainya null.

*/

val Int?.slice: Int
    get() = this?.div(2) ?: 0
    // atau : get() = if (this == null) 0 else this.div(2)

/*

If expression pada contoh di atas adalah untuk memeriksa apakah receiver object-nya bernilai null.
Jika tidak bernilai null, maka receiver object tersebut akan secara otomatis di-casting menjadi tipe non-null,
sehingga kita bisa menggunakan nilainya.

*/

/*
Lalu kapan kita membutuhkannya?

Tentunya jika kita mempunyai sebuah objek yang bernilai null.
Saat kita tidak menetapkannya dengan nullable receiver type, maka kita perlu memeriksa
apakah objek tersebut bernilai null atau tidak? Bisa juga dengan menggunakan operator safe call
setiap kali extension tersebut dipanggil.

*/



fun main() {
    //Cara memanggilnya pun sama
    println(2.slice)
}