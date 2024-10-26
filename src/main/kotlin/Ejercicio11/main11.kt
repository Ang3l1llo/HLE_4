package org.example

fun main() {
    print("Introduce el número de términos de la secuencia Fibonacci: ")
    val n = readLine()!!.toInt()

    var a = 0
    var b = 1

    repeat(n) {
        print("$a ")
        val siguiente = a + b
        a = b
        b = siguiente
    }
}
