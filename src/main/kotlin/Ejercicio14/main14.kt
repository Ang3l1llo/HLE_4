package org.example
import Ejercicio14.Videojuego

fun main() {
    val inventario = mutableListOf<Videojuego>()
    var opcion: Int

    do {
        print("Elige una opción: ")
        println("1. Añadir videojuego")
        println("2. Eliminar videojuego")
        println("3. Mostrar inventario")
        println("4. Salir")

        opcion = readLine()!!.toInt()

        when (opcion) {
            1 -> {
                print("Introduce el título: ")
                val titulo = readLine()!!

                print("Introduce la plataforma: ")
                val plataforma = readLine()!!

                print("Introduce las horas jugadas: ")
                val horas = readLine()!!.toInt()

                inventario.add(Videojuego(titulo, plataforma, horas))
            }

            2 -> {
                print("Introduce el título del videojuego a eliminar: ")
                val tituloEliminar = readLine()!!
                inventario.removeIf { it.titulo.equals(tituloEliminar) }
            }

            3 -> {
                if (inventario.isEmpty()) {
                    println("El inventario está vacío.")
                } else {
                    inventario.forEach {
                        it.mostrarInfo()
                        println()
                    }
                }
            }
        }
    } while (opcion != 4)
}