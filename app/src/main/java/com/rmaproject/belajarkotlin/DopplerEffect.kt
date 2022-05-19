package com.rmaproject.belajarkotlin

fun main() {

    val vPAkhir: Int
    val vsAkhir: Int
    print("Masukkan nilai kecepatan penerima: ")
    var vP = readLine()?.toInt()
    print("Masukkan nilai kecepatan sumber: ")
    var vS = readLine()?.toInt()
    print("Apakah nilai kecepatan penerima dalam km/j? (yes/no) ")
    val isInKmPerJForVP = readLine()
    if (isInKmPerJForVP == "y" || isInKmPerJForVP == "Y" || isInKmPerJForVP == "ya" || isInKmPerJForVP == "Ya") {
        vP = vP!! * 10
        vP /= 36
    }
    print("Apakah nilai kecepatan sumber dalam km/j? (yes/no) ")
    val isInKmPerJForVS = readLine()
    if (isInKmPerJForVS == "y" || isInKmPerJForVS == "Y" || isInKmPerJForVS == "ya" || isInKmPerJForVS == "Ya") {
        vS = vS!! * 10
        vS /= 36
    }
    print("Masukkan nilai cepat rambat bunyi (dala m/s): ")
    val v = readLine()?.toInt()
    print("Masukkan nilai frekuensi sumber bunyi (dalam Hz): ")
    val f = readLine()?.toInt()

    print("Apakah penerima menjauhi? (yes/no) ")
    val isPenerimaMenjauhi = readLine()
    vPAkhir = if (isPenerimaMenjauhi == "y" || isPenerimaMenjauhi == "Y" || isPenerimaMenjauhi == "ya" || isPenerimaMenjauhi == "Ya") {
        v!! - vP!!
    } else {
        v!! + vP!!
    }

    print("Apakah sumber menjauhi? (yes/no)")
    val isSumberMenjauhi = readLine()
    vsAkhir = if (isSumberMenjauhi == "y" || isSumberMenjauhi == "Y" || isSumberMenjauhi == "ya" || isSumberMenjauhi == "Ya") {
        v + vS!!
    } else {
        v - vS!!
    }

    println(countDopplerEffect(f!!, vPAkhir, vsAkhir))
}

fun countDopplerEffect(f: Int, vp: Int, vs: Int): String? {
    val result = (f * vp) / vs
    return "Frekuensi sumber: $f, kecepatan penerima: $vp, kecepatan sumber: $vs, frekuensi penerima: $result"
}
