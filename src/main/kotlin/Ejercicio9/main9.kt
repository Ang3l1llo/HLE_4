package org.example

fun main() {
    print("Introduce un número: ")
    val numero = readLine()!!.toInt()

    val esPrimo = if (numero < 2) {
        false
    } else {
        (2..Math.sqrt(numero.toDouble()).toInt()).none { numero % it == 0 }
    }

    if (esPrimo) {
        println("$numero es un número primo.")
    } else {
        println("$numero no es un número primo.")
    }
}
