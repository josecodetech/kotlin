fun main() {
	val resultado = celsiusAFahrenheit(25.0)
    println("25 grados Celsius equivalen a $resultado grados Fahrenheit")
}
fun celsiusAFahrenheit(celsius:Double):Double{
    return (celsius*9/5)+32
}