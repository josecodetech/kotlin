/**
 Funcion suma
 */
fun sumar(a:Int,b:Int):Int{
    return a+b
}
fun restar():Int{
    val num1 = 4
    val num2 = 7
    return num1 - num2
}
fun saludar(){
    println("Hola")
}

fun main() {
    var resultado = sumar(7,4)
    println("La suma es : $resultado")
    saludar()
    resultado = restar()
    println("La resta es : $resultado")
}