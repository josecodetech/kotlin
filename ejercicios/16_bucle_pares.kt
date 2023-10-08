fun main() {
	var numero: Int = 10
    for (i in 1..numero){
        if (i % 2 == 0){
            print(i)
            println("*")
        } else {
            println(i)
        }
    }
}