package com.rmaproject.belajarkotlin.oopprogramming

import java.lang.Exception

/*
Exception handling dapat diterapkan dengan beberapa cara. Di antaranya adalah dengan menggunakan try-catch,
try-catch-finally, dan multiple catch. Mari kita pelajari ketiga cara tersebut.
*/

/*
try-catch
Salah satu cara untuk menangani suatu exception adalah menggunakan try-catch.
Kode yang dapat membangkitkan suatu exception disimpan dalam blok try,
dan jika exception tersebut terjadi, maka blok catch akan terpanggil.
Berikut cara penulisan try-catch pada Kotlin:
*/

fun main() {
    try {
        // Block try, menyimpan kode yang membangkitkan exception
    } catch (e:Exception) {
        // Block catch akan terpanggil ketika exception bangkit.
    }

    /*
    Dengan menuliskan kode dalam blok try,
    kode kita menjadi terproteksi dari exception.
    Jika terjadi exception maka program tidak akan terhenti atau crash,
    namun akan dilempar menuju blok catch.

    Di sana kita dapat menuliskan sebuah kode alternatif untuk menampilkan pesan eror atau yang lainnya.
    */

    /*
    try-catch-finally

    Selain terdapat blok try dan catch, ada juga blok finally.
    Hanya saja blok ini bersifat opsional. finally akan dieksekusi setelah program
    keluar dari blok try ataupun catch. Bahkan finally juga tereksekusi ketika
    terjadi exception yang tidak terduga. Exception tidak terduga terjadi ketika kita
    menggunakan NullPointerException pada catch namun exception yang terjadi adalah NumberFormatException.
    */

    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    someMustNotNullValue = try {
        someNullValue!!
    } catch (e: Exception) {
        "Nilai String Null"
    } finally { //disini kode didalam finally akan dipanggil jika ada exception yang tidak terduga.
        println(someMustNotNullValue)
    }

    /*

    Dari kode yang kita coba sebelumnya, kita menggunakan exception untuk menangani semua
    tipe exception yang terjadi. Baik itu ketika terjadi NullPointerException atau
    NumberFormatException. Sebenarnya pada catch kita dapat secara spesifik memilih tipe
    exception apa yang ingin ditangani.

    Multiple catch memungkinkan untuk penanganan exception dapat didtangani lebih dari
    satu tipe exception. Hal ini sangat berguna ketika kita ingin menangani setiap tipe
    exception dengan perlakuan yang berbeda.

    Berikut contoh struktur kode dengan menerapkan multiple catch:
    */

    try{
        // Block try, menyimpan kode yang membangkitkan exception
    } catch (e: NullPointerException) {
        // Block catch akan terpanggil ketika terjadi NullPointerException.
    } catch (e: NumberFormatException) {
        // Block catch akan terpanggil ketika terjadi NumberFormatException.
    } catch (e: Exception) {
        // Block catch akan terpanggil ketika terjadi Exception selain keduanya.
    }
    finally {
        // Block finally akan terpanggil setelah keluar dari block try atau catch
    }

    /*
    Dari struktur kode di atas, kita dapat melihat terdapat 3 (tiga) blok catch.
    Block catch yang pertama menggunakan parameter NullPointerException,
    sehingga jika terjadi NullPointerException maka blok catch tersebut akan dieksekusi.
    Yang kedua block catch dengan parameter NumberFormatException,
    sehingga jika terjadi NumberFormatException maka blok tersebut yang akan dieksekusi.
    Dan yang terakhir blok catch dengan parameter Exception, blok ini akan menangani
    seluruh exception yang terjadi kecuali untuk dua exception yang telah ditentukan pada blok sebelumnya.
    */
}