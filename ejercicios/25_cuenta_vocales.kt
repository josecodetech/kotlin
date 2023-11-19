fun main() {
	val resultado = contarVocales("Visita mi canal de youtube @josecodetech")
    println("Numero de vocales = $resultado")
}
fun contarVocales(cadena: String):Int{
    val cadenaLowerCase = cadena.toLowerCase()
    val vocales = "aeiou"
    var contador = 0
    for (char in cadenaLowerCase){
        if (char in vocales){
            contador ++
        }
    }
    return contador
}