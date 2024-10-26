package org.example

fun main() {
    print("Introduce un número: ")
    val numero = readLine()!!.toInt()

    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }
}
