package org.example

fun main() {
    print("Introduce una cadena: ")
    val cadena = readLine()!!

    val reverso = cadena.reversed()
    println("La cadena al revés es: $reverso")
}
