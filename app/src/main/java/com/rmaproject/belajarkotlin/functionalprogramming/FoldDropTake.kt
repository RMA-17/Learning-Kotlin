package com.rmaproject.belajarkotlin.functionalprogramming

/*

Kotlin Collection adalah salah satu struktur data mumpuni yang banyak menyediakan fungsi
untuk memudahkan kita dalam mengelola dan memanipulasi data.
Pada sub-modul sebelumnya, kita sudah mempelajari beberapa fungsi yang disediakan seperti
map(), sum(), sorted(), dan sebagainya.

Pada sub-modul ini kita akan mempelajari beberapa fungsi tingkat lanjut
lainnya yang tentunya bisa kita manfaatkan untuk mengelola data seperti yang disebutkan di atas.

*/

//fold
/*
Langsung saja kita mulai dengan fungsi fold, kita bisa dengan mudah melakukan perhitungan setiap
nilai yang berada di dalam sebuah collection tanpa harus melakukan iterasi item tersebut
satu-persatu menggunakan fungsi fold(). Untuk contoh penggunaannya adalah sebagai berikut:
*/

fun main() {
    val numbers = listOf(3, 2, 1)

    val fold = numbers.fold(10) { current, item ->
        println("current: $current")
        println("item: $item")
        println()
        current + item

        //item = isi dari numbers nya.
        //current = dihitung dari initial.
    }

    println("fold: $fold")



    /*
    Fungsi fold() memerlukan 2 (dua) argumen yaitu nilai awal untuk perhitungan dan lambda
    expression yang nilai kembaliannya digunakan untuk menentukan nilai awal selanjutnya.
    Nah, di dalam lambda expression nya juga terdapat 2 (dua) argumen.
    Yaitu, argumen current yang merepresentasikan nilai awal dan argumen item merepresentasikan
    masing-masing item yang berada pada numbers.
    */

    //fold juga bisa membaca dari value yang terakhir menggunakan foldRight:

    val foldRight = numbers.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

    //drop

    /*

    Selanjutnya adalah fungsi drop(), fungsi yang bisa kita manfaatkan untuk memangkas item yang berada di
    dalam sebuah objek collection berdasarkan jumlah yang kita tentukan.
    Sebagai contoh, saat kita mempunyai sebuah collection seperti berikut:
    */

    val number = listOf(1,2,3,4,5,6)
    val droppedNumber = number.drop(2 )//item (index) yang akan dipangkas)
    print(droppedNumber)

    //fungsi drop juga bisa memangkas dari belakang menggunakan dropLast()

    val droppedLastNumber =  number.dropLast(2)
    print(droppedLastNumber)

    //take

    /*
    Jika fungsi drop() digunakan untuk memangkas, fungsi take() bisa kita manfaatkan untuk menyaring
    item yang berada di dalam sebuah objek collection. Pemanggilan fungsi take() sama halnya
    seperti fungsi drop() di mana kita perlu menentukan jumlah item yang akan disaring.
    Berikut contoh penggunaannya:
    */

    val numberWillBeTake = listOf(1,2,3,4,5,6,7,8)
    val takeNumber = numberWillBeTake.take(3)

    /*
    Kotlin juga menyediakan fungsi seperti dropLast() yang menjalankan operasi dari posisi atau
    indeks terakhir yaitu takeLast(). Contohnya seperti berikut:
    */

    val takeNumberLast = numberWillBeTake.takeLast(3)
}