package com.rmaproject.belajarkotlin.oopprogramming

/*
Secondary Constructor

Digunakan ketika kita ingin menginisialisasi sebuah kelas dengan cara yang lain.
Anda dapat membuat lebih dari satu secondary constructor. Sebagai contoh, kita bisa menambahkan
secondary constructor pada kelas Animal:
*/

class AnimalWithConstruct(name: String, weight: Double, age: Int) {
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean
    var isHerbivore:Boolean = false

    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = false
    }

    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(name, weight, age) {
        this.isMammal = isMammal
    }
    constructor(name:String, weight: Double, age: Int, isMammal: Boolean, isHerbivore:Boolean) : this(name, weight, age, isMammal) {
        this.isHerbivore = isHerbivore
    }
}