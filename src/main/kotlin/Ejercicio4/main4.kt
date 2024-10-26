package org.example

import kotlin.random.Random

fun main() {
    val numeroAleatorio = Random.nextInt(1, 101)
    var intento : Int

    do {
        print("Adivina el número (entre 1 y 100): ")
        intento = readLine()!!.toInt()

        when {
            intento < numeroAleatorio -> println("El número es mayor.")
            intento > numeroAleatorio -> println("El número es menor.")

        }
    } while (intento != numeroAleatorio)
    println("¡Felicidades! Adivinaste el número.")
}
