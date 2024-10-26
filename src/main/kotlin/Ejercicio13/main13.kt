package org.example
import Ejercicio13.Anime

fun main() {
    print("Introduce el nombre del anime: ")
    val nombre = readLine()!!

    print("Introduce el número de episodios: ")
    val episodios = readLine()!!.toInt()

    print("Introduce el género: ")
    val genero = readLine()!!

    val anime = Anime(nombre, episodios, genero)
    anime.mostrarInfo()
}