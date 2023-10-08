
fun main() {
	val cadena = "Hola, que tal?"
    for (caracter in cadena){
        if (caracter in "aeiou"){
            print(caracter)
        }
    }
}