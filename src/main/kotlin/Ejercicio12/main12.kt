package org.example

fun main() {
    print("Introduce un número: ")
    var numero = readLine()!!.toInt()

    var invertido = 0
    while (numero != 0) {
        val digito = numero % 10
        invertido = invertido * 10 + digito
        numero /= 10
    }

    println("El número invertido es: $invertido")
}
