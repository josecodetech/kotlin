fun main() {
	val resultado = contarPalabras("Kotlin es un lenguaje de programacion versatil, mas info en @josecodetech")
    println("Numero de palabras = $resultado")
}
fun contarPalabras(cadena:String):Int{
    val palabras = cadena.split(" ")
    return palabras.size
}