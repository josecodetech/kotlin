fun main() {
	val resultado = encontrarMayor(10,3,15)
    println("El numero mayor es $resultado")
}
fun encontrarMayor(num1: Int,num2:Int,num3:Int):Int{
    return maxOf(num1,num2,num3)
}