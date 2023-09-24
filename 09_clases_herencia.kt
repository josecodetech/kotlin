open class Vehiculo(val marca: String){
    open fun conducir(){
        println("El vehiculo $marca esta en movimiento.")
    }
}
class Coche(marca:String):Vehiculo(marca){
    override fun conducir(){
        println("El coche con marca $marca esta en movimiento")
    }
}
fun main() {
	val vehiculo01:Vehiculo = Vehiculo("Toyota")
    val vehiculo02:Vehiculo = Coche("Ford")
    vehiculo01.conducir()
    vehiculo02.conducir()
}