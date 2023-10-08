fun main() {
	val cadena = "Hola me llamo Jose"
    for (i in 0 until cadena.length){
        val posicion = (0 until cadena.length).random()
        val caracter = cadena[posicion]
        print(caracter)
    }
}