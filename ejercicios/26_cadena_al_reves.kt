fun main() {
    val resultado = reversoDeCadena("kotlin")
    println("Cadena al reves = $resultado")
}
fun reversoDeCadena(cadena: String):String{
    return cadena.reversed()
}