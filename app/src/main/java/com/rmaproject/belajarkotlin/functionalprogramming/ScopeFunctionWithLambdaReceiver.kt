package com.rmaproject.belajarkotlin.functionalprogramming

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder

//run

/*
Fungsi run akan mengembalikan nilai berdasarkan expression yang berada di dalam blok lambda.
Untuk mengakses konteks dari objek, ia akan menggunakan receiver (this).
Fungsi run akan sangat berguna jika di dalam blok lambda terdapat
inisialisasi objek dan perhitungan untuk nilai kembalian.

Contoh penggunaannya seperti berikut:
*/

//with

/*
Pada dasarnya fungsi with bukanlah sebuah extension melainkan hanyalah fungsi biasa.
Konteks objeknya disematkan sebagai argumen dan dari blok lambda diakses sebagai receiver.
*/

//apply

/*
Berbeda dengan fungsi-fungsi sebelumnya, nilai yang dikembalikan dari fungsi apply
adalah nilai dari konteks objeknya dan objek konteksnya tersedia sebagai receiver (this).
Baiknya fungsi apply dapat melakukan inisialisasi atau konfigurasi dari receiver-nya.
*/

fun main() {
    val text = "Hello"
    //.run {} ini menjadikan sebuah variable menjadi sebuah fungsi, dengan this adalah value variable yang di .run{}
    //kalau kita taruh sebuah String atau Int diakhir line, maka itu akan menjadi return nya
    val result = text.run {  // <- Return Unit
        println(this)
    }
    val resultInt = text.run {// <- Return Int
        this.length

    }

    val message = "Hello World"
    //With function mirip dengan run function, menggunakan reference this
    //Yang membedakan adalah, with function bukanlah extension function, jadi tidak bisa digunakan langsung dari object-nya
    //Kita harus memanggil with function secara manual
    val resultWith = with(message) {
        println(this)
    }

    //Fungsi with sendiri disarankan untuk mengakses apa yang menjadi anggotanya tanpa harus menyediakan nilai kembalian.
    val messageSB = StringBuilder().apply {
        append("Hello ")
        append("World")
    }

    println(messageSB.toString())

}

//Kasus lain bisa dipakai di MaterialAlertDialogBuilder
class ScopeFunctionWithLambdaReceiver : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        val mDialog = MaterialAlertDialogBuilder(this)
        mDialog.apply {
            setTitle("Mamang")
            setMessage("Hello")
            show()
            create()
        }
    }
}