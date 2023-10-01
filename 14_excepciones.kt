fun dividir(dividendo: Int, divisor: Int): Int{
    if (divisor == 0){
        throw ArithmeticException("Division por cero no permitida")
    }
    return dividendo / divisor
}
fun main() {
    // val resultado = 10/0
    try {
        val resultado = dividir(10,2)
        println("Resultado: $resultado")
    } catch (ex: ArithmeticException){
        println("Error: Division por cero")
    } finally {
        println("Operacion finalizada")
    }
}