fun main() {
	var numero: Int = 100
    for (i in 1..numero){
        if (i%3==0 || i%5==0){
            println(i)
        }
    }
}