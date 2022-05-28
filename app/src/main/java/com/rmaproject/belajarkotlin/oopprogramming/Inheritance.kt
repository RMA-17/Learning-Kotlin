package com.rmaproject.belajarkotlin.oopprogramming

fun main() {
    /*
    Dalam gambaran dunia nyata, banyak objek yang berbeda tetapi punya kesamaan atau kemiripan tertentu.
    Contohnya Kucing dan Kambing memiliki banyak kesamaan karena objek tersebut merupakan hewan.
    Kucing merupakan hewan mamalia, begitu juga dengan kambing.
    Mungkin yang membedakan objek tersebut adalah cara mereka mencari makanan dan jenis makanan yang dimakan.
    Sama halnya pada OOP, beberapa objek yang berbeda bisa saja memiliki kesamaan dalam hal tertentu.
    Di situlah konsep inheritance atau pewarisan harus diterapkan.
    */

//    class Cat(val name: String, val furColor: String, val weight: Double, val age: Int, val numberOfFeet: Int, val isCarnivore: Boolean) {
//        fun eat(){
//            println("$name sedang makan!")
//        }
//
//        fun sleep() {
//            println("$name sedang tidur!")
//        }
//
//        fun playWithHuman() {
//            println("$name bermain dengan Manusia!")
//        }
//    }

    /*
    Tidak ada masalah dengan kode tersebut, tetapi ketika kita akan membuat kelas dari diagram
    lainnya contohnya Fish maka kita harus menuliskan ulang properti seperti
    name, weight, age dan properti atau fungsi yang sama lainnya.
    Hal ini dapat mengurangi efisiensi dalam menuliskan kode.

    Dengan teknik inheritance, kita bisa mengelompokkan properti dan fungsi yang sama.
    Caranya , buat sebuah kelas baru yang nantinya akan diturunkan sifatnya pada sebuah kelas:
    */

    open class Animal(val name: String, val weight: Double, val age: Int) {
        open fun eat() {
            println("$name sedang makan!")
        }

        open fun sleep() {
            println("$name sedang tidur!")
        }
    }

    /*
    Untuk membuat sebuah super atau parent class kita akan membutuhkan open class.
    Kelas pada Kotlin secara default bersifat final, oleh karena itu kita harus mengubahnya
    menjadi open class sebelum melakukan extends kelas tersebut.
    */

    class Cat(name:String, age:Int, weight:Double) : Animal(name, weight, age) {


        fun playWithHuman() {
            println("$name bermain dengan Manusia!")
        }

        override fun eat() {
            super.eat()
            //super itu maksud nya adalah parent nya, jadi
            //kita bisa
        }
    }


}