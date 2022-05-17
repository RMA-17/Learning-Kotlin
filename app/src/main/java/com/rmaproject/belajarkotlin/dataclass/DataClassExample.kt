package com.rmaproject.belajarkotlin.dataclass

/*
Beberapa hal yang perlu diperhatikan dalam membuat sebuah data class adalah:

Konstruktor utama pada kelas tersebut harus memiliki setidaknya satu parameter.

Semua konstruktor utama perlu dideklarasikan sebagai val atau var.

Modifier dari sebuah data class tidak bisa abstract, open, sealed, atau inner.
 */

data class DataClassExample(
    val name: String,
    val age: Int,
    val address: String
)
