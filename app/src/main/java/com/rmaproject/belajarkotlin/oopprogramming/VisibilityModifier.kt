package com.rmaproject.belajarkotlin.oopprogramming

fun main() {
    /*
    Visibility Modifiers

    Kali ini kita akan mengenal beberapa tentang visibility modifiers atau hak akses Pada Kotlin.
    Tentunya, tidak semua properti dan fungsi pada sebuah kelas memiliki hak akses publik.
    Ada beberapa yang hanya dapat diakses dari dalam dan ada yang dapat diakses dari luar kelasnya.
    Dengan menentukan hak akses tersebut, kita dapat membatasi akses data pada sebuah kelas.
    Berikut macam - macam hak akses dan penjelasan singkatnya yang dapat digunakan pada Kotlin:
    */

    /*
    Public: Hak akses yang cakupannya paling luas. Anggota yang diberi modifier ini dapat diakses dari manapun.

    Private: Hak akses yang cakupannya paling terbatas. Anggota yang menerapkannya hanya dapat diakses pada scope yang sama. (Hanya class itu sendiri)

    Protected: Hak akses yang cakupannya terbatas pada hirarki kelas. Anggota hanya dapat diakses pada kelas turunannya atau kelas itu sendiri. (Class sekarang dan untuk turunannya.)

    Internal: Hak akses yang cakupannya terbatas pada satu modul. Anggota yang menggunakannya tidak dapat diakses diluar dari modulnya tersebut.
    */

    /*
    Semua modifier tersebut bisa digunakan untuk kelas, objek, konstruktor, fungsi, beserta
    properti yang ada di dalamnya. Kecuali modifier protected yang hanya bisa digunakan untuk
    anggota di dalam sebuah kelas dan interface. Protected tidak bisa digunakan pada package
    member seperti kelas, objek, dan yang lainnya. Setelah mengetahui pentingnya hak akses,
    selanjutnya kita akan membahas bagaimana kita menentukan hak akses public, private, protected dan internal pada Kotlin.
    */
}