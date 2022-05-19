package com.rmaproject.belajarkotlin.dataclassandcollections.collections

fun main() {
    //filter() & filterNot()

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evenNumbers = numbers.filter { numberList ->
        numberList % 2 == 0
    }
    println(evenNumbers) // evenList: [2, 4, 6, 8, 10]

    /*
    Pada kode di atas, kita telah menggunakan filter() untuk menyaring bilangan yang habis dibagi 2 (dua) atau biasa disebut dengan bilangan genap.
    Selain itu kita juga dapat mem-filter list berdasar hasil yang tak sesuai dengan kondisi yang diberikan.
    Caranya adalah dengan menggunakan fungsi filterNot().
     */

    val notEvenList = numbers.filterNot { numberList ->
        numberList % 2 == 0
    }

    println(notEvenList) // notEvenList: [1, 3, 5, 7, 9]

    //filterNot() adalah kebalikan dari filter()

    //map()

    /*
    Fungsi yang akan sering dipakai berikutnya adalah map().
    Fungsi ini akan membuat collection baru sesuai perubahan yang akan kita lakukan dari collection sebelumnya.
    Kita ambil contoh dari numberList yang sudah ada. Lalu kita buat collection baru yang isinya adalah hasil kali 5 (lima) dari masing-masing item.
    Maka Anda bisa menggunakan kode seperti berikut:
    */

    val multipliedByFive = numbers.map {numberList ->
        numberList * 5
    }

    println(multipliedByFive) // multipliedByFive: [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]

    //count()

    /*
    Fungsi yang sering dipakai adalah count().
    Fungsi ini akan menghitung jumlah item yang ada di dalam collection.
    Kita bisa menggunakan kode seperti berikut:
    */

    val count = numbers.count()
    println(count) // count: 10

    //find(), firstOrNull(), lastOrNull()

    /*
    Fungsi yang sering dipakai adalah find(), firstOrNull(), dan lastOrNull().
    Untuk mencari item pertama yang sesuai dengan kondisi yang kita tentukan, kita bisa menggunakan fungsi find().
    Contoh, kita perlu mencari angka ganjil pertama dari numberList maka kodenya akan seperti berikut:
    */

    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }

    // firstOddNumber: 1
    // firstOrNullNumber: null

    // first() dan last()

    /*
    Hampir sama seperti fungsi firstOrNull() dan lastOrNull(), fungsi first() dan last() digunakan untuk menyaring item pertama atau terakhir dari sebuah collection.
    Kita juga bisa menambahkan sebuah kondisi dengan parameter lambda. Namun perlu diperhatikan jika kita menambahkan kondisi padahal kondisi tersebut tidak terpenuhi,
    apa hasilnya? Exception! Lihat saja contohnya pada kode berikut:
    */

    numberList.first { it % 2 == 10 } // Exception

    //Sum
    //Sum ini digunakan untuk menjumlahkan semua value didalam list
    numberList.sum() //output: 55

    //sorted()

    /*
    sorted() digunakan untuk mengurutkan item yang ada di dalam collection.
    Secara default fungsi sorted() ini akan mengurutkan data secara ascending. Perhatikan kode di bawah ini:
    */

    val sortedList = numberList.sorted() // Ini akan mengurutkan secara ASC

    //Sedangkan untuk DESC kita bisa menggunakan sortedDescending()

    val sortedListDescending = numberList.sortedDescending() // Ini akan mengurutkan secara DESC

}