fun main() {
	val resultado = esPrimo(17)
    println("¿Es primo ? $resultado")
}
fun esPrimo(numero: Int): Boolean{
    if (numero<=1){
        return false
    }
    for (i in 2 until numero ){
        if (numero % i == 0){
            return false
        }
    }
    return true
}