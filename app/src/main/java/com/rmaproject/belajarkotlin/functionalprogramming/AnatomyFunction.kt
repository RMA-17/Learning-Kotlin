package com.rmaproject.belajarkotlin.functionalprogramming

fun main() {

}

//Funtion Header:

/*
Function header adalah bagian yang merupakan konstruksi dari sebuah fungsi untuk menentukan perilakunya akan seperti apa.
Di dalam function header terdapat visibility modifier,
kata kunci fun, nama, daftar parameter dan nilai kembalian dari fungsi tersebut.
*/

//Visibility modifier atau tingkatan akses merupakan bagian spesifik dari sebuah bahasa pemrograman yang ditujukan untuk mengatur bagaimana hak akses dari sebuah kelas, fungsi, properti dan variabel.

/*
Secara default ketika kita membuat sebuah fungsi baru, ia akan memiliki modifier public.
Artinya fungsi tersebut dapat diakses dari luar kelas. Sedangkan contoh pada ilustrasi di atas adalah sebuah fungsi yang memiliki modifier private.
Maka akses dari fungsi tersebut terbatas hanya untuk kelas di mana fungsi tersebut dideklarasi.
Terdapat beberapa visibility modifier yang akan kita pelajari bersama pada sub-modul Object Orientation Programming nanti.
*/

private fun functionExample(parameter:String) : String {

    /*
    Ketika kita mendeklarasikan sebuah fungsi baru, kita bisa atau tanpa menetapkan parameter tersebut.
    Parameter adalah data atau nilai yang disematkan ketika fungsi tersebut dipanggil.
    antinya parameter akan diproses di dalam fungsi tersebut. Kita bisa melampirkan nilai konstan atau variabel untuk sebuah fungsi ketika ia dipanggil.

    Parameter dari sebuah fungsi terdiri dari nama dan tipe dari parameter itu sendiri. Ia digunakan untuk menentukan nilai atau variabel apa yang dapat dilampirkan.
    Setiap parameter dipisahkan oleh tanda (,). Catatan: setiap parameter bersifat read-only, sehingga kita hanya diijinkan untuk menggunakan nilainya untuk diproduksi.
    */

    //Function Body
    return "Hello $parameter"
}

/*
Terakhir adalah return type. Setiap fungsi yang kita deklarasi sejatinya akan selalu mengembalikan
dan nilai yang akan dikembalikan bisa kita gunakan untuk keperluan lain. Misalnya untuk dijadikan sebagai argumen untuk fungsi lainnya.
*/