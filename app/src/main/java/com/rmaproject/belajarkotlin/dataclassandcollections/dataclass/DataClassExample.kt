package com.rmaproject.belajarkotlin.dataclassandcollections.dataclass

/*
Beberapa hal yang perlu diperhatikan dalam membuat sebuah data class adalah:

Konstruktor utama pada kelas tersebut harus memiliki setidaknya satu parameter.

Semua konstruktor utama perlu dideklarasikan sebagai val atau var.

Modifier dari sebuah data class tidak bisa abstract, open, sealed, atau inner.
 */

class User(
    val name: String,
    val age: Int
) {
    /*
    Dan jika Anda menginginkan hasil yang akurat seperti pada data class,
    maka Anda perlu membuat fungsi equals() secara manual:
     */

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
    /*
    Anda perlu menuliskan beberapa boilerplate code di atas untuk mendapatkan hasil yang sesuai.
    Belum lagi ketika Anda menambahkan fungsi equals(), Anda juga perlu menambahkan fungsi hashCode().
     */
}

data class DataUser(
    val name: String,
    val age: Int
) {
    /*
    Destructuring Declaration adalah proses memetakan objek menjadi sebuah variabel.
    Ini bisa dengan mudah kita lakukan pada data class. Dengan fungsi componentN() yang ada pada data class,
    kita bisa menguraikan sebuah objek menjadi beberapa properti yang dimilikinya.
    Sebagai contoh, kita ingin menguraikan objek dataUser:
     */
    fun intro() : String {
        return "Hello, my name is $name and I'm $age years old"
    }
}

fun main() {
    val userr = User("Rizki", 25)
    val dataUserr = DataUser("Rizki", 25)

    println(userr)
    println(dataUserr)

    /*
    Output diatas:
    com.rmaproject.belajarkotlin.dataclass.User@3b6eb2ec
    DataUser(name=Rizki, age=25, address=Jl. Kebon Kacang)
     */
    //Ini membuktikan bahwa Dataclass lebih safe digunakan untuk menampung data dibandingkan denga class biasa

    /*
    Bisa kita perhatikan, bahwa objek user menghasilkan teks oo.User@4d7e1886 dimana com.rmaproject.belajarkotlin.dataclass merupakan nama package tempat kelas User berada.
    User adalah nama dari kelas itu sendiri, dan @4d7e1886 adalah memory address dari kelas tersebut.
    Sedangkan, objek dataUser menghasilkan teks DataUser(name=nrohmen, age=17), yaitu nama kelas disertai dengan semua properti di dalamnya dan value dari properti tersebut.
     */

    /*
    Kelebihan lain dari data class adalah ia sudah memiliki fungsi equals() secara otomatis.
    Maka jika Anda ingin melakukan komparasi konten antara 2 buah objek,
    lakukanlah dengan mudah seperti contoh di bawah ini:
     */

    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))

    /*
    Konsol akan langsung memberi tahu apakah kedua objek tersebut
    sama atau tidak ketika Anda menjalankan fungsi main():

    true
    false
     */

    /*
    Lain halnya jika kita melakukan komparasi pada 2 buah objek yang bukan dari data class.
    Kita tidak bisa mendapatkan hasil yang akurat karena konsol akan selalu menghasilkan nilai false.
    Sebagai contoh, perhatikanlah kode berikut:
     */

    val user = User("nrohmen", 17)
    val user2 = User("nrohmen", 17)
    val user3 = User("dimas", 24)

    println(user.equals(user2))
    println(user.equals(user3))

    /*
    Maka hasilnya akan sama saja, false semua. Hal ini karena dia tidak membandingkan kontennya,
    melainkan lokasi object (referensi) pada memory.

    false
    false
     */


}
