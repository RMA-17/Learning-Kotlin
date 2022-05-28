package com.rmaproject.belajarkotlin.oopprogramming

/*
Extension properties pada Kotlin sama halnya seperti melakukannya pada Extension function.
Kita dapat menambahkan sebuah properti tanpa harus membuat sebuah kelas yang mewarisi kelas tersebut.
Tetapi perlu diingat bahwa properti yang kita buat bukan benar - benar berada pada kelas.
Sebabnya, Extension properties dilakukan di luar kelas. Dengan demikian,
Extension properties hanya bisa didefinisikan dengan cara menyediakan getter dan/atau setter secara eksplisit.
Mari kita buat sebuah Extension properties pada kelas Animal.
*/

class Animalism(var name:String, var age:Int)

fun Animalism.getName() : String {
    return this.name
}


fun main() {
    val animal = Animalism("Kuda", 20)
    println(animal.getName())
}