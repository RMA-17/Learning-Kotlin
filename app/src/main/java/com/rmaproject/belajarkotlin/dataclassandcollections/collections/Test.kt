package com.rmaproject.belajarkotlin.dataclassandcollections.collections

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
    val firstOrNullNumbeer = numberList.find { it % 2 == 3 }

    println("First Odd Number: $firstOddNumber")
    println("First Or Null Number: $firstOrNullNumber")
    println("First Or Null Number false: $firstOrNullNumbeer")
}