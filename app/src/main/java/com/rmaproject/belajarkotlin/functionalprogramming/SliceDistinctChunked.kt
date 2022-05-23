package com.rmaproject.belajarkotlin.functionalprogramming

fun main() {
    //slice

    /*
    Setelah pembahasan fungsi take() pada sub-modul sebelumnya, muncul pertanyaan,
    bagaimana jika kita ingin menyaring item dari posisi tertentu? Untuk itu kita bisa
    memanfaatkan fungsi slice(). Dalam penggunaannya, fungsi slice() membutuhkan sebuah argumen
    berupa Range yang digunakan untuk menentukan posisi pertama dan terakhir yang akan disaring.

    Berikut contohnya:
    */

    val numberWillBeSliced = listOf(1,2,3,4,5,6,7,8)
    val sliced = numberWillBeSliced.slice(1..3) //slice ini index yg diambil
    println(sliced) //output: [2, 3, 4]

    /*
    Kemudian jika ingin menentukan posisi yang lebih spesifik, kita bisa mendefinisikannya
    di dalam sebuah collection, kemudian disematkan sebagai argumen. Misal seperti di bawah berikut:
    */

    val index = listOf(2, 3, 5, 8)
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(index)

    println(slice) //output: [3, 5, 8]

    /*
    Kita harus berhati-hati dalam menentukan cakupan index untuk mendapatkan data.
    Karena dapat menyebabkan terjadinya ArrayIndexOutOfBoundsException jika posisi yang
    ditentukan tidak terdapat pada objek collection.
    */

    //distinct

    /*
    Saat berurusan dengan item yang sama di dalam sebuah collection, untuk menyaring item yang
    sama tersebut kita akan melakukan iterasi dan membandingkan setiap itemnya.
    Namun dengan Kotlin kita tidak perlu melakukannya secara manual, karena Kotlin Collection
    menyediakan fungsi untuk melakukannya dengan mudah yaitu fungsi distinct(). Sebagai contoh:
    */

    val totalDistinct = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = totalDistinct.distinct()

    println(distinct)

    //intinya distinct itu mengubah list menjadi set. Dah gitu aja.

    /*
    Sama halnya seperti beberapa fungsi sebelumnya yang sudah dibahas,
    fungsi distinct() bisa langsung dipanggil dari objek collection.
    Kita juga bisa menggunakannya pada collection dengan tipe parameter seperti data class.
    Misal seperti berikut:
    */

    data class Item(val key: String, val value: Any)

    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )

    /*
    Menariknya, kita bisa juga menentukan proses penyaringan item yang sama seperti
    apa yang akan dijalankan dengan menggunakan fungsi distinctBy().
    Misal kita ingin menyaring item yang memiliki panjang sama,
    kita bisa melakukannya seperti berikut:
    */

    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
        /*
        output:
        1 with value Kotlin
        2 with value is
        3 with value Awesome
        */
    }

    //chunked

    /*
    Sama seperti fungsi split(), fungsi chunked() bisa kita gunakan untuk memecah nilai Strin
    menjadi beberapa bagian kecil dalam bentuk Array. Namun untuk penerapannya sedikit berbeda,
    di mana fungsi split() membutuhkan argumen berupa RegEx sebagai parameter sedangkan chunked()
    membutuhkan nilai yang akan digunakan sebagai jumlah indeks untuk pemisah.

    Contoh penggunaannya seperti berikut:
    */

    val word = "QWERTY"
    val chunked = word.chunked(3)

    println(chunked) //output: [QWE,RTY]



}