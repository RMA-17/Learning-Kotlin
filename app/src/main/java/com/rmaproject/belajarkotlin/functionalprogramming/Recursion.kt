package com.rmaproject.belajarkotlin.functionalprogramming


/*
Recursion merupakan sebuah teknik dasar dalam pemrograman yang bisa kita gunakan
untuk menyederhanakan pemecahan masalah yang umumnya diselesaikan dengan cara yang kompleks.
Di Kotlin, recursion disebut juga dengan recursive function.

Recursive function adalah sebuah mekanisme di mana sebuah fungsi digunakan
dari dalam fungsi itu sendiri. Ini memungkinkan sebuah fungsi dapat berjalan beberapa kali.
Setiap pemanggilannya bisa kita atur agar dapat mengembalikan nilai dan digunakan sebagai
argumen untuk pemanggilan fungsi berikutnya serta mengembalikan nilai akhir berupa perhitungan
nilai kembalian dari setiap pemanggilan fungsi tersebut.
*/

//Contoh recursive:
fun factorial(n: Int): Int {
    return if (n == 1) {
        //factorial = 4!
        n
    } else {
        println("$n")
        n * factorial(n - 1)
    }
}

//Fungsi di atas adalah contoh bagaimana menghitung faktorial dari nilai yang kita tentukan.

/*

Ketika kita menjalankan fungsi di atas, program akan menciptakan tumpukan frame dengan jumlah
berdasarkan nilai n di mana setiap frame akan mengkonsumsi memori. Ini bisa jadi masalah dalam
penerapannya.
Contoh, jika kita memasukkan argumen dengan nilai besar ketika ingin menggunakannya seperti berikut:

println("Factorial 9999 is: ${factorial(9999)}")

Maka pada konsol akan menampilkan eror berikut:

Exception in thread "main" java.lang.StackOverflowError
*/

/*
Tail Call Recursion

Namun kita tidak perlu khawatir dengan masalah seperti di atas.
Kotlin mendukung gaya pemrograman fungsional yang bernama tail recursion yakni sekumpulan
urutan instruksi untuk menjalankan tugas tertentu (subroutine) yang dijalankan terakhir pada sebuah prosedur.

Dengannya, kita bisa meminimalisir penumpukan frame ketika kita menerapkan recursive.

~ Tail recursion akan memastikan proses sebelumnya telah selesai sebelum pemanggilan fungsi berikutnya dijalankan.~
Contohnya adalah seperti berikut:
*/

fun factorialTail(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorialTail(n - 1, newResult)
    }
}

/*
Namun dengan kode di atas kita tidak bisa langsung menghindari penumpukan frame.
Ini karena secara default JVM tidak mendukung optimasi tail recursion.
Untuk itu, Kotlin menyediakan modifier agar kita bisa tetap menerapkannya,
yaitu modifier tailrec.

Penggunaannya adalah seperti berikut:
*/

tailrec fun tailFactorial(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        tailFactorial(n - 1, newResult)
    }
}

/*
 Ketika sebuah fungsi ditandai dengan modifier tailrec, maka fungsi tersebut hanya boleh
 dipanggil untuk dijalankan terakhir dan tidak boleh digunakan dari dalam blok try-catch-finally.
*/


//Penjelasan dari ProgrammerZamanNow:
/*
Apa itu recrusive function?

- Recrusive function adalah function yang memanggil dirinya sendiri.
- Kadang dalam pekerjaan, recursive function lebih mudah daripada tidak menggunakan recursive function.
- Contoh recursive function yg mudah adalah factorial.

Apa itu tail recursive function?

- Tail recursive function adalah salah satu kemampuan bagus di Kotlin, namun sayangnya
  ada keterbatasan dalam penggunaan recursive.
- Jika recursive function yang kita buat saat dijalankan memanggil function nya sendiri terlalu dalam,
  maka bisa dimungkinkan terjadinya penumpukan frame (error stackoverflow).

    Cara kerja recursive function bukan sekedar loop,
    recursive function bekerja dengan menumpuk function diatas function terus terusan.

- Tail recursive function adalah teknik mengubah recursive function menjadi sebuah loop biasa.
- Tida semua recursive function bisa diubah menjadi tail recursive function.

Syarat Tail recursive function:
    - Tambahkan tailrec di depannya
    - Saat memanggil function dirinya sendiri, hanya boileh memanggil function dirinya sendiri,
    tanpa embel-embel oerasi dengan data lain.
*/

fun main() {
    print("Factorial 10 is: ${factorial(10)}")

    //factorial yang lebih gampang:
    fun simplifiedFactorial(value:Int) : Int {
        return when (value) {
            1 -> 1
            else -> value * simplifiedFactorial(value - 1)
        }
    }

    print("\nFactorial 10 is: ${simplifiedFactorial(10)}")
}