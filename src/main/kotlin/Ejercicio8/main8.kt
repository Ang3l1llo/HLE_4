package org.example

fun main() {
    print("Introduce una frase: ")
    val frase = readLine()!!.lowercase()

    val contadorVocales = frase.count { it in "aeiou" }
    println("La frase contiene $contadorVocales vocales.")
}
