fun main() {
    val resultado = factorial(3)
    println("El factorial de 3 es $resultado")
}
fun factorial(N: Int):Int{
    if (N==0){
        return 1
    }
    var resultado = 1
    for (i in 1..N){
        resultado *= i
    }
    return resultado
}