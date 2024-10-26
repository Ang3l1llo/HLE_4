package org.example

fun main() {
    print("Introduce un número: ")
    val numero = readLine()!!.toInt()

    if (numero % 2 == 0) {
        println("$numero es par.")
    } else {
        println("$numero es impar.")
    }
}
