package com.rmaproject.belajarkotlin.oopprogramming

import kotlin.reflect.KProperty

//Contoh class delegation:

class DelegateName {
    private var value :Any = "default"

    operator fun getValue(classRef: Any?, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue:Any) {
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class AnimalReeeaaall {
    var name by DelegateName()
    var umur by DelegateName()
}

fun main() {
    val animal = AnimalReeeaaall()
    animal.name = "Bambang"
    print(animal)

    val umurAnimal = AnimalReeeaaall()
    umurAnimal.umur = 20
    print(umurAnimal)
}
/*

Perhatikan kode diatas, kita telah memberikan nilai pada setiap properti dengan tipe data yang berbeda.
Tetapi dengan DegelateGenericClass(), pengelolaan properti dapat digunakan pada seluruh tipe data properti.

*/