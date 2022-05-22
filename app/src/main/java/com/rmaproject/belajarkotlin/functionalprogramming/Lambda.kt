package com.rmaproject.belajarkotlin.functionalprogramming

/*
Lambda

Lambda expression, biasa disebut dengan anonymous function atau function literal adalah fitur yang
cukup populer sampai sekarang dalam dunia functional programming. Bisa disebut sebagai anonymous
karena lambda tidak memiliki sebuah nama seperti halnya sebuah fungsi pada umumnya.
Karena merupakan sebuah fungsi, lambda juga dapat memiliki daftar parameter, body dan return type.

~Istilah lambda sendiri berasal dari istilah akademis lambda calculus yang digunakan untuk menggambarkan proses komputasi~.


*/

/*

Karakteristik Lambda:

    - Dalam menggunakan lambda, kita tidak perlu mendeklarasi tipe spesifik untuk nilai kembaliannya.
    Tipe tersebut akan ditentukan oleh kompiler secara otomatis.

    - Walaupun merupakan sebuah fungsi, lambda tidak membutuhkan kata kunci fun dan visibility modifier
    saat dideklarasikan, karena lambda bersifat anonymous.

    - Parameter yang akan ditetapkan berada di dalam kurung kurawal {}.

    - Ketika ingin mengembalikan nilai, kata kunci return tidak diperlukan lagi karena kompiler akan
    secara otomatis mengembalikan nilai dari dalam body.

    - Lambda expression dapat digunakan sebagai argumen untuk sebuah parameter
    dan dapat disimpan ke dalam sebuah variabel.

*/

/*

Dari beberapa karakteristik di atas, lambda sangat berguna karena dapat membuat
penulisan kode menjadi lebih mudah dan sederhana. Salah satu contohnya adalah kita bisa menghindari
boilerplate code dalam menggunakan anonymous class seperti berikut:

*/

val comparatorBoros = object :Runnable{
    override fun run() {
        // BOROS DISINI, KALAU PAKAI LAMBDA G USH PAKEK override fun
    }
}

val comparatorLambda = Runnable {
    // GAK BOROS KAN???
}

/*
Menggunakan Lambda Expression

Setelah mengetahui apa itu lambda dan karakteristiknya, bagaimana cara mendeklarasikannya?
Perhatikan contoh kode di bawah ini.
*/

//tanpa parameter:
val message = { println("Hello From Lambda") }

//dengan parameter:
val messageWithParam = { message: String -> println(message) }

/*

Kode di atas adalah contoh deklarasi dari lambda, di mana fungsi lambda di atas ditandai dengan sepasang kurung kurawal.
Di dalamnya terdapat fungsi untuk mencetak teks pada konsol.
Ketika ingin menggunakannya, kita bisa memanggilnya seperti halnya kita memanggil sebuah fungsi pada umumnya.

*/

/*

Seperti yang disebutkan sebelumnya, parameter dari sebuah lambda berada di dalam kurung kurawal.
Untuk membedakannya dengan body, daftar parameter yang ada dipisahkan dengan tanda ->.
Kemudian, bagaimana cara mendeklarasi lambda agar dapat mengembalikan nilai?
Untuk itu kita bisa menuliskannya seperti di bawah ini:

*/

val lengthMessageWithParam = { message: String -> message.length }

/*

Bisa kita perhatikan, kita tidak membutuhkan tipe kembalian dan kata kunci return untuk mengembalikan sebuah nilai.
Pada dasarnya,kompiler akan mengembalikan nilai berdasarkan expression
atau statement di baris terakhir di dalam body.

*/

fun main () {
    message()   //Jadi seperti function.

}