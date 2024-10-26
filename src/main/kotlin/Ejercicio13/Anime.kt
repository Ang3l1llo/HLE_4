package Ejercicio13

class Anime(val nombre: String, val episodios: Int, val genero: String) {
    fun mostrarInfo() {
        println("Nombre: $nombre")
        println("Episodios: $episodios")
        println("Género: $genero")
    }
}


