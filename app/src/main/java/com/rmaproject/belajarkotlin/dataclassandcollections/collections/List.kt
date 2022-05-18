package com.rmaproject.belajarkotlin.dataclassandcollections.collections

import com.rmaproject.belajarkotlin.dataclassandcollections.dataclass.DataUser


fun main() {
    //Contoh List:
    val list:List<Int> = listOf(1, 2, 3, 4, 5)

    //Kompiler akan langsung mengetahui bahwa list ini berupa list of integer. Jadi kita tidak
    //perlu menuliskan tipe data setiap elemen list seperti dibawah ini:

    val list2 = listOf("A", "B", "C", "D", "E")
    val list3 = listOf(1, 2, 3, 4, 5)

//    Sedangkan untuk membuat List dengan tipe data yang berbeda,
//    cukup masukkan saja data tersebut seperti kode berikut:

    val listDynamic:List<Any> = listOf("A", "B", 2.2F, 2, 2)

    /*
    Karena setiap objek pada Kotlin merupakan turunan dari kelas Any, maka variabel anyList tersebut akan memiliki tipe data List<Any>.
    Jika kita tampilkan list di atas maka konsol akan menampilkan:[a, Kotlin, 3, true]
     */

//    Bahkan kita pun bisa memasukkan sebuah data class ke dalam List tersebut:

    val anyList = listOf('a', "Kotlin", 3, true, DataUser("Mamang", 21))

    //value dalam list bisa diambil dengan cara:
    println(anyList[0])

    //List diatas, adalah list yang immutable, jadi tidak bisa diubah dan absolute value nya
    //untuk mengubah urutan atau value list, dilakukan dengan cara menginisiasi nya menggunakan mutableListOf():

    val mutableAnyList = mutableListOf('a', "Kotlin", 3, true, DataUser("Mamang", 21))

//    Dengan begitu, anyList sekarang merupakan sebuah List yang bersifat mutable dan kita bisa memanipulasi data di dalamnya.

    mutableAnyList.add('d') // menambah item di akhir list
    mutableAnyList.add(1, "love") // menambah item pada indeks ke-1
    mutableAnyList[3] = false // mengubah nilai item pada indeks ke-3
    mutableAnyList.removeAt(1) // menghapus item User() berdasarkan index atau posisi nilai di dalam Array
}
