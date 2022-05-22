package com.rmaproject.belajarkotlin.dataclassandcollections.collections

fun main() {
    //Sequences

    /*
    Tiga (3) jenis collection yang sudah kita pelajari sebelumnya merupakan jenis collection yang menjalankan eager evaluation.
    Berbeda dengan itu, Sequence merupakan collection yang bisa dikategorikan ke dalam lazy evaluation.
    Jika eager evaluation mengevaluasi seluruh item yang ada pada collection,
    lazy evaluation hanya akan mengevaluasi  item jika benar-benar diperlukan.
    */

    val list = (1..1000000).toList()
    list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println("List: $it") }

    /*
    Pada contoh kode di atas, kita memiliki data collection sejumlah 1 juta item,
    kemudian masing-masing data akan disaring berdasarkan angka yang merupakan kelipatan 5 lalu dikalikan 2 dan akhirnya ditampilkan pada konsol.
    Dengan eager evaluation atau dikenal dengan horizontal evaluation, list akan menyelesaikan proses filter terhadap 1 juta data
    baru kemudian melakukan mapping data sampai akhirnya ditampilkan pada konsol.

    Untuk menerapkan lazy  atau vertical evaluation maka kita perlu mengubah list menjadi Sequence.
    Caranya sangat sederhana, yaitu dengan memanggil fungsi asSequence().
    */

    list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println("Sequence: $it") }

    /*
    Dengan sequence, operasi akan dilakukan secara vertikal atau per item, misalnya dimulai angka 1.
    Karena tidak memenuhi kondisi pada filter maka operasi tidak akan dilanjutkan ke map().
    Sampai dengan iterasi ke-5 akan dilakukan mapping, angka 5 akan dikalikan 2 dan ditampilkan pada konsol,
    setelah itu akan dilanjutkan ke iterasi berikutnya sampai dengan iterasi ke-1 juta.

    Untuk membuat objek Sequence, kita bisa menggunakan fungsi yang tersedia pada standard library yaitu generateSequence().
    */

    val sequenceNumber = generateSequence(1) { it + 1 }

    /*
    Pada kode di atas kita telah membuat variabel sequenceNumber dengan menggunakan fungsi generateSequence()
    Fungsi ini memiliki 2 parameter. Parameter pertama adalah item pertama yang ada di dalam collection.
    Parameter kedua adalah lambda expression berisi perubahan pada masing-masing item.
    Pada contoh kode tadi, setiap item merupakan item sebelumnya ditambah 1.
    Fungsi generateSequence() akan membuat collection sequence secara tak terbatas.
    Alhasil, kita perlu menambahkan fungsi take() supaya program tidak mengalami infinite loop.
    */

    sequenceNumber.take(5).forEach {
        println("Generate Sequences: $it")
    }

    //Intinya kalau mau filter list yang isinya banyak sampe , pakai sequences aja biar cepat. Soalnya dia vertically filtered


}