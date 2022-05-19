package com.rmaproject.belajarkotlin.dataclassandcollections.collections

fun main() {
    //Contoh Set:
    val setExample = setOf(1, 2, 3, 4, 5, 2, 1,3, 10)

    print(setExample) // output: [1, 2, 3, 4, 5, 10]

    /*
    Secara otomatis fungsi setOf akan membuang angka yang sama,
    sehingga hasilnya adalah [1, 2, 3, 4, 5, 10]. Selain itu urutan pada Set bukanlah sesuatu yang penting,
    sehingga apabila kita bandingkan dua buah Set yang memiliki nilai yang sama dan urutan yang berbeda,
    akan tetap dianggap sama.
    */

    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB) // Output: true

//    Kita juga dapat melakukan pengecekan apakah sebuah nilai ada di dalam Set
//    dengan menggunakan kata kunci in.
    print(5 in setA) // Output: true

//    Kemudian ada juga fungsi union dan intersect untuk mengetahui gabungan dan irisan dari 2 (dua) buah Set.
//    Sebagai contoh:

    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)

// union: [1, 2, 4, 5, 7]
// intersect: [1, 5]

//    Pada Mutable Set kita bisa menambah dan menghapus item namun tak bisa mengubah nilai seperti pada List.

    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    //mutableSet[2] = 6 // tidak bisa mengubah set immutable
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1

}