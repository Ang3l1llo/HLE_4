package org.example

fun main() {
    print("Introduce la temperatura: ")
    val temperatura = readLine()!!.toDouble()

    print("¿Es Celsius o Fahrenheit? PULSE->(C/F): ")
    val tipo = readLine()!!.uppercase()

    when (tipo) {
        "C" -> {
            val fahrenheit = temperatura * 9 / 5 + 32
            println("$temperatura°C son $fahrenheit°F.")
        }
        "F" -> {
            val celsius = (temperatura - 32) * 5 / 9
            println("$temperatura°F son $celsius°C.")
        }
        else -> println("La temperatura esta bien caliente")
    }
}
