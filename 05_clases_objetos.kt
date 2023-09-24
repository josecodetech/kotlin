// clase Persona
class Persona(val nombre:String, val edad:Int){
    fun mostrarinformacion(){
        println("Nombre: $nombre, Edad: $edad")
    }
}
fun main() {
	// crear objeto de la clase
	val jose = Persona("Jose", 51)
    val mar = Persona("Mar",49)
    // mostrar informacion del objeto
    jose.mostrarinformacion()
    mar.mostrarinformacion()
}