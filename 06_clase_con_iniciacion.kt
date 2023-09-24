// clase Persona
class Persona(nombre:String, edad:Int){
    val nombre: String
    val edad: Int
    init{
        this.nombre = nombre.capitalize()
        this.edad = edad
    }
    fun mostrarInformacion(){
        println("Nombre: $nombre, Edad: $edad")
    }
    fun esMayorEdad(edad:Int):Boolean{
        return edad>=18
    }
}
fun main() {
	// crear objeto de la clase
	val jose = Persona("Jose", 51)
    val mar = Persona("Mar",49)
    // mostrar informacion del objeto
    jose.mostrarInformacion()
    mar.mostrarInformacion()
    val mayorEdad = jose.esMayorEdad(jose.edad)
    println(mayorEdad)
}