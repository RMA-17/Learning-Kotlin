package com.rmaproject.belajarkotlin.kotlingenerics



/*
    Mendeklarasikan Kelas Generic
    Setelah mengetahui contoh bagaimana generic bekerja pada sebuah kelas,
    selanjutnya kita akan mempelajari bagaimana penerapan generic itu sendiri.
    Kita bisa menerapkannya dengan meletakkan tipe parameter ke dalam angle brackets (<>) seperti berikut:
*/

interface List<T> {
    operator fun get(index: Int): T
}

//Selain T kita bisa menuliskan typedata lain, asalkan dengan huruf kapital
//Kita juga bisa membatasi tipedata yang bisa dipakai dalam sebuah kelas dengan menuliskan seperti ini:
// List<T: String> nanti yang selain string akan error kalau dimasukkan.

//Pada kode di atas, tipe parameter T bisa kita gunakan sebagai tipe reguler yang mengembalikan tipe dari sebuah fungsi.

/*
Selanjutnya, jika kita mempunyai sebuah kelas yang mewarisi kelas atau interface generic,
maka kita perlu menentukan tipe argumen sebagai tipe dasar dari parameter generic kelas tersebut.
Parameternya bisa berupa tipe yang spesifik atau lainnya. Contohnya seperti berikut:
*/

class LongList : List<Long> {
    override fun get(index: Int): Long {
        return this[index]
    }
}

class ArrayList:List<String> {
    override fun get(index: Int): String {
        return this[index]
    }
}

/*
Pada kelas LongList di atas, Long digunakan sebagai tipe argumen untuk List,
sehingga fungsi yang berada di dalamnya akan menggunakan Long sebagai tipe dasarnya.
Berbeda dengan kelas ArrayList, di mana tipe argumen untuk kelas List menggunakan T.
Dengan demikian ketika kita menggunakan kelas ArrayList,
kita perlu menentukan tipe argumen dari kelas tersebut saat diinisialisasi.
*/

fun main() {
    /*
    Yang perlu diperhatikan dari kelas ArrayList di atas adalah deklarasi dari tipe parameter T.
    Tipe parameter tersebut berbeda dengan yang ada pada kelas List,
    karena T adalah milik kelas ArrayList itu sendiri.
    */
}