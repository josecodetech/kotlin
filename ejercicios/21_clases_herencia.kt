open class Persona(var nombre: String, var apellidos: String, var fechaDeNacimiento: String){
    fun mostrarDatos(){
        println("Nombre: $nombre $apellidos")
        println("Fecha de nacimiento: $fechaDeNacimiento")
    }
}
class Alumno(nombre: String, apellidos: String, fechaDeNacimiento: String, var nota: Double):Persona(nombre,apellidos,fechaDeNacimiento){
    fun asignarNota(nuevaNota:Double){
        nota = nuevaNota
    }
    fun mostrarNota(){
        println("Nota del alumno: $nota")
    }
}
fun main(){
    val alumno1 = Alumno("Juan", "Perez", "10/05/2000",9.5)
    alumno1.mostrarDatos()
    alumno1.mostrarNota()
    alumno1.asignarNota(9.0)
    alumno1.mostrarNota()
}