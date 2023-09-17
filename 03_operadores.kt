// aritmeticos + - * / 
// logicos && || !
// comparacion == != < > <= >= 
// condicional if y else 
fun main() {
    val numero1 = 10
    val numero2 = 6  
	val suma = numero1 + numero2
    val resta = numero1 - numero2
    val multiplicacion = numero1 * numero2
    val division = numero1 / numero2
    val esMayor = numero1 > numero2
    println("La suma es $suma")
    println("La resta es $resta")
    println("La multiplicacion es $multiplicacion")
    println("La division es $division")
    if (esMayor){
        println("El numero 1 es mayor que el numero 2")
    }else{
        println("El numero 1 es menor o igual al numero 2")
    }
}