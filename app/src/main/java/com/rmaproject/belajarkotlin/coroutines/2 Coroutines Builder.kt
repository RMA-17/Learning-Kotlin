package com.rmaproject.belajarkotlin.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/*

Kotlin menyediakan beberapa coroutine builder yang bisa disesuaikan dengan berbagai macam skenario, seperti:

launch
Seperti yang sudah kita coba sebelumnya, fungsi ini digunakan untuk memulai sebuah coroutines
yang tidak akan mengembalikan sebuah hasil. launch akan menghasilkan Job yang bisa kita gunakan
untuk membatalkan eksekusi.

runBlocking
Fungsi ini dibuat untuk menjembatani blocking code menjadi kode yang dapat ditangguhkan.
runBlocking akan memblokir sebuah thread yang sedang berjalan hingga eksekusi coroutine selesai.
Seperti contoh sebelumnya, kita bisa menggunakannya pada fungsi main()
dan bisa juga untuk penerapan unit test.

async
Kebalikan dari launch, fungsi ini digunakan untuk memulai sebuah coroutine
yang akan mengembalikan sebuah hasil. Ketika menggunakannya, Anda harus berhati-hati karena
ia akan menangkap setiap exception yang terjadi di dalam coroutine.
Jadi async akan mengembalikan Deferred yang berisi hasil atau exception.
Ketika yang dikembalikan adalah exception, maka Anda harus siap untuk menanganinya.

*/

//Contoh penerapan async {}

suspend fun getCapital() : Int {
    delay(1000L)
    return 5000
}

suspend fun getIncome() : Int {
    delay(1000L)
    return 7500
}
/*
Anggap saja bahwa delay pada kedua fungsi tersebut adalah waktu yang dibutuhkan untuk melakukan
operasi sebelum hasilnya didapatkan. Selanjutnya kita ingin memanfaatkan keduanya,
misalnya untuk menghitung keuntungan seperti berikut:
*/

fun main() : Unit = runBlocking {
//    val capital = getCapital()
//    val income = getIncome()
//
//    println("Your income is: ${income - capital}") //2500

    /*
    Pada kode di atas, kita menggunakan pendekatan sequential.
    Kenapa? Pada dasarnya kode di dalam coroutines juga dijalankan secara
    berurutan seperti kode normal lain. Dalam praktiknya kita melakukan ini jika kita
    menggunakan hasil dari fungsi pertama untuk membuat keputusan apakah kita perlu memanggil
    fungsi kedua.
    */

    /*
    Bagaimana jika tidak ada ketergantungan antara fungsi getCapital dan getIncome dan kita
    ingin menjalankan keduanya secara bersamaan? Di sinilah async dibutuhkan.
    Kita bisa menuliskan kode seperti berikut:
    */

//    val capital = async {getCapital()}
//    val income = async {getIncome()}
//
//    println("Your income is: ${income.await() - capital.await()}") //fungsi await adalah untuk mengakses hasil tersebut
    //output: 2500

    /*
    Dengan kode tersebut, kita telah memanggil fungsi getCapital dan getIncome di dalam async.
    Maka async akan mengembalikan hasil dari masing-masing fungsi. Lalu untuk mengakses hasil
    tersebut, kita perlu menggunakan fungsi await.
    */

    /*
    Dengan async seolah-olah kedua fungsi tersebut berjalan bersamaan dan membutuhkan waktu yang
    lebih singkat dari kode sebelumnya.
    */

    val timeOne = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("Your profit is ${income - capital}")
    }

    val timeTwo = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("Your profit is ${income.await() - capital.await()}")
    }

    println("Completed in ${timeOne}ms vs ${timeTwo}ms")


}

/*

Catatan tambahan:

Launch Function
The launch will not block the main thread, but on the other hand, the execution of the rest
part of the code will not wait for the launch result since launch is not a suspend call.

When to Use Launch?
Launch can be used at places where users do not want to use the returned result,
which is later used in performing some other work. For example, It can be used at places involving
tasks like update or changing a color, as in this case returned information would be of no use.

Async Function
Async is also used to start the coroutines, but it blocks the main thread at
the entry point of the await() function in the program.

When to Use Async?
When making two or more network call in parallel, but you need to wait for the answers before
computing the output, ie use async for results from multiple tasks that run in parallel.
If you use async and do not wait for the result, it will work exactly the same as launch.

                Launch                                                                                                                  Async

The launch is basically fire and forget.	                                                                            Async is basically performing a task and return a result.
launch{} does not return anything.	                                                                                    async{ }, which has an await() function returns the result of the coroutine.
launch{} cannot be used when you need the parallel execution of network calls.	                                        Use async only when you need the parallel execution network calls.
launch{} will not block your main thread.	                                                                            Async will block the main thread at the entry point of the await() function.
Execution of other parts  of the code will not wait for the launch result since launch is not a suspend call	        Execution of the other parts of the code will have to wait for the result of the await() function.
It is not possible for the launch to work like async in any case or condition.	                                        If you use async and do not wait for the result, it will work exactly the same as launch.
Launch can be used at places if you don’t need the result from the method called. 	                                    Use async when you need the results from the multiple tasks that run in parallel.
Example: It can be used at places involving tasks like update or changing color like fetch User And Save In Database. 	Example: Imagine the condition, when we have to fetch two users’ data from the database by using two parallel network calls and then use them for computing some results based on their data.

*/
