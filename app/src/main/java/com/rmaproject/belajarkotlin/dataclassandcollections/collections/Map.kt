package com.rmaproject.belajarkotlin.dataclassandcollections.collections

fun main() {

    //Contoh Map:
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

//    String yang berada pada sebelah kiri dari kata kunci to adalah sebuah key,
//    sedangkan yang di sebelah kanan merupakan value-nya. Lalu untuk mengakses nilai dari Map tersebut,
//    kita bisa menggunakan key yang sudah dimasukkan. Misalnya, kita bisa menggunakan key “Jakarta” untuk mendapatkan value “Indonesia”:

    println(capital["Jakarta"]) // Output: Indonesia

//    Atau bisa juga menggunakan fungsi getValue():

    println(capital.getValue("Jakarta"))// Output: Indonesia

    //Kalau misalkan kita menggunakan capital['Key'] tapi tidak ada value nya, maka akan return null
    //Tapi jika menggunakan getValue('key') maka akan return exception

    /*Informasi Tambahan:
    Untuk menambahkan key-value ke dalam map, kita perlu memastikan bahwa map yang digunakan adalah mutable. Mari kita ubah map capital yang sudah kita buat sebelumnya menjadi mutable.
    */

    val mutableCapital = capital.toMutableMap()
//    Selanjutnya kita bisa menambahkan key-value baru menggunakan fungsi put().

    mutableCapital["Amsterdam"] = "Netherlands"
    mutableCapital["Berlin"] = "Germany"

    /*
    Namun perlu diperhatikan bahwa menggunakan mutable collection itu tidak disarankan. Apabila terdapat sebuah mutable collection yang diubah oleh lebih dari 1 proses, hasil nya akan sulit untuk diprediksi. Untuk itu,
    sebaiknya gunakan immutable sebisa mungkin, jika memang dibutuhkan untuk diubah, baru gunakan mutable.
     */
}