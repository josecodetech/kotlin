fun main() {
    val N = 20
    val resultado = sumaNumerosPares(N)
    println("La suma de numeros pares hasta $N es $resultado")
}
fun sumaNumerosPares(N: Int):Int{
    var suma = 0 
    for (i in 1..N){
        if (i % 2 == 0){
            suma+=i
        }
    }
    return suma
}