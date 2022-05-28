package com.rmaproject.belajarkotlin.kotlingenerics

/*
Variance
Sebelumnya kita telah mempelajari bagaimana generic bekerja, bagaimana penerapannya,
serta bagaimana kita bisa menentukan batasan tipe argumen yang bisa ditentukan terhadap tipe parameter.
Selanjutnya kita akan belajar salah satu konsep dari generic yaitu variance.

Apa itu variance? Variance adalah konsep yang menggambarkan bagaimana sebuah tipe yang memiliki
subtipe yang sama dan tipe argumen yang berbeda saling berkaitan satu sama lain.
Variance dibutuhkan ketika kita ingin membuat kelas atau fungsi generic dengan batasan yang tidak
akan mengganggu dalam penggunaannya.
*/


//Invariant: Tipe generic class biasa, akan tetapi tidak bisa di assign ke parent class nya,
//Tidak ada penanda.

//Covariant: Tipe generic class yang hanya dapat meng-output saja, tidak bisa/diperbolehkan menerima input,
//Covariant bisa di assign ke parent class nya, penandanya adalah dengan "out"

//Contravariant: Tipe generic class yang hanya dapat menerima input saja, tidak bisa/diperbolehkan meng-output,
//Ditandai dengan "in"