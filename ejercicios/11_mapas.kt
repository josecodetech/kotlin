fun main() {
	val edades = mapOf("Juan" to 30, "Maria" to 25, "Pedro" to 35, "Ana" to 28)
    println("Edades: $edades")
    for ((nombre,edad) in edades){
        println("$nombre tiene $edad años")
    }
}