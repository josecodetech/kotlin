fun main() {
    val numeros = listOf(1,2,3,4,5,6)
    // funcion de orden superior para duplicar cada numero
    val numerosDuplicados = numeros.map{ it * 2}
    // filtro para numeros pares
    val numerosPares = numeros.filter { it % 2 == 0}
    // reducir la lista a suma
    val suma = numeros.reduce { acc, numero -> acc + numero}
    
    println("Numeros originales: $numeros")
    println("Numeros duplicados: $numerosDuplicados")
    println("Numeros pares: $numerosPares")
    println("Suma de numeros: $suma")
}