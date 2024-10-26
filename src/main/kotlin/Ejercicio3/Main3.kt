package org.example

import kotlin.math.PI
import kotlin.math.pow

fun main() {
    print("Introduce el radio del círculo: ")
    val radio = readLine()!!.toDouble()

    val area = PI * radio.pow(2)
    println("El área del círculo es: $area")
}
