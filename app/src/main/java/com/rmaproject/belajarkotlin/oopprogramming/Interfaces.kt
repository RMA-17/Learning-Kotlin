package com.rmaproject.belajarkotlin.oopprogramming

/*
Interfaces

Interfaces merupakan suatu konsep sifat umum yang nantinya digunakan oleh suatu kelas
agar dapat memiliki sifat tersebut. Interface sangat mirip dengan abstract class,
namun tanpa sebuah properti deklarasi dan fungsi yang dideklarasikan tanpa isi.
Tujuan dari interface ini hanya untuk diimplementasikan oleh sebuah kelas.
Kelas yang mengimplementasikan sebuah interface diharuskan melakukan override
seluruh properti dan fungsi sekaligus mendefinisikan isi fungsi yang terdapat pada interfaces-nya.
*/

/*
Cara pembuatan sebuah interface mirip dengan membuat kelas. Pada umumnya penamaan sebuah
interface dituliskan dengan awalan huruf I kapital. Hal ini tidak diharuskan secara sintaks
tapi ini merupakan penerapan terbaik dalam penamaan sebuah interface.

Tujuannya agar dapat mudah membedakannya dengan kelas.
Berikut merupakan contoh pembuatan sebuah interface:
*/

interface IFly {
    fun fly()
    val numberOfWings:Int
}

/*
Jika ada variable didalam class interface, maka kita perlu mengoverride variable yang ada dari interface
kedalam class warisannya.
*/

class Bird(override val numberOfWings: Int) : IFly {
    //Jika ingin mengimplementasikan interface, maka harus melakukan override
    override fun fly() {
        TODO("Not yet implemented")
    }
}

/*
Kita akan mendapati eror jika menuliskan class dengan pewarisan interface tanpa di override.
Pesan eror tersebut mengatakan “class Bird is not abstract and does not implement abstract member”.
Maksud dari eror tersebut adalah kita harus  mengimplementasi sebuah abstract member
yang pada kasus ini adalah sebuah fungsi abstract yang terdapat pada IFly.
Maka untuk menghilangkan eror tersebut, kita harus melakukan override fungsi yang terdapat pada IFly.
*/

