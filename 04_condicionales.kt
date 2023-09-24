fun main() {
    // con IF ELSE
    val numero = 15
    if (numero > 0){
        println("El numero es positivo")
    }
    else if (numero<0){
        println("El numero es negativo")
    }else{
        println("El numero es igual a cero")
    }
    // con When equivalente al switch
    when (numero){
        1 -> println("El numero es uno")
        2 -> println("El numero es dos")
        in 3..5 -> println("El numero esta entre 3 y 5 (inclusives)")
        else -> println("El numero no esta entre las opciones anteriores")
    }
}