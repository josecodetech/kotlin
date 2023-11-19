fun main() {
	val resultado = esPalindromo("Anilina")
    println("¿Es palindromo? $resultado")
}
fun esPalindromo(cadena: String):Boolean{
    val cadenaLimpia = cadena.replace(" ","").toLowerCase()
    val longitud = cadenaLimpia.length
    for (i in 0 until longitud / 2){
        if (cadenaLimpia[i]!=cadenaLimpia[longitud-i-1]){
            return false
        }
    }
    return true
}