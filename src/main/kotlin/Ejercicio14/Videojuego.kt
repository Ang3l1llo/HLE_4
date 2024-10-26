package Ejercicio14

class Videojuego (val titulo : String, var plataforma : String, var horasJugadas : Int){
    fun mostrarInfo() {
        println("Título: $titulo")
        println("Plataforma: $plataforma")
        println("Horas Jugadas: $horasJugadas")
    }
}