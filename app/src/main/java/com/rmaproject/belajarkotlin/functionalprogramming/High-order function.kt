package com.rmaproject.belajarkotlin.functionalprogramming

import java.text.SimpleDateFormat
import java.util.*

/*

High-order function

Yaitu sebuah fungsi yang menggunakan fungsi lainnya sebagai parameter,
menjadikan tipe kembalian, ataupun keduanya. Yang perlu diperhatikan adalah,
jika argumen terakhir dari fungsi merupakan sebuah lambda expression,
maka lambda expression tersebut ditempatkan di luar parenthesis

*/

fun main() {
    printResult(10, testsum)
}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

var testsum: (Int) -> Int = { value -> value + value }
