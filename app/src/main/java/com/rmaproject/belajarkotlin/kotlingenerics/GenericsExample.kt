package com.rmaproject.belajarkotlin.kotlingenerics

fun main() {
    /*

    Sebelum kita mempelajari bagaimana cara kita mendeklarasikan sebuah kelas generic,
    ada baiknya jika kita melihat contoh bagaimana generic bekerja pada variabel dengan tipe List.
    Kita perlu menentukan tipe dari nilai yang bisa disimpan di dalam variabel List tersebut:

    */

    val contributor = listOf("Rizki", "Ridwan", "Rizal")
    /*

    Perhatikan kode di atas. Tipe parameter yang digunakan dalam pemanggilan fungsi listOf()
    adalah String maka nilai yang bisa kita masukkan adalah nilai dengan tipe String.
    Kita bisa menyederhanakannya dengan menghapus tipe parameter tersebut.
    Karena kompiler akan menetapkannya secara otomatis bahwa variabel yang kita buat adalah String.
    */

    /*

    Berbeda jika kita ingin membuat variabel list tanpa langsung menambahkan nilainya.
    Maka list tersebut tidak memiliki nilai yang bisa dijadikan acuan untuk kompiler menentukan tipe parameter.
    Alhasil, kita wajib menentukannya secara eksplisit seperti berikut:

    */


    /*
    Selain itu, kita juga bisa mendeklarasikan lebih dari satu tipe parameter untuk sebuah kelas.
    Contohnya adalah kelas Map yang memiliki dua tipe parameter yang digunakan sebagai key dan value.
    Kita bisa menentukannya dengan argumen tertentu, misalnya seperti berikut:
    */

    val points = mapOf<String, Int>( "alfian" to 10 , "dimas" to 20 )

    //Intinya, generics ini terletak bagaimana kita menentukan sebuah tipedata terhadap sebuah list, map, dll.
    // ketika menemukan tanda <> berarti itu adalah generics.
}