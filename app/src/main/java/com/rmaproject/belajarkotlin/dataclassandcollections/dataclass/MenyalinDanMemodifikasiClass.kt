package com.rmaproject.belajarkotlin.dataclassandcollections.dataclass

fun main() {
    val dataUser = DataUser("Rizki", 12)
    val dataUser2 = DataUser("Mamank", 12)
    val dataUser3 = DataUser("Mamangz", 12)
    //Menyalin Dataclass:
    val dataUser4 = dataUser2.copy()
    //Memodifikasi dataclass:
    val dataUser5 = dataUser3.copy(name = "Mamang")

    println("Data User 4 = $dataUser4")
    println("Data User 5 = $dataUser5")

    println(dataUser5.intro())
}