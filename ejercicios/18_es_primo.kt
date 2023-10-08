fun main() {
    var numero: Int = 100
    for (i in 2..numero){
        var esPrimo = true
        for (j in 2..i / 2){
            if (i % j == 0){
                esPrimo = false
                break
            }
        }
        if (esPrimo){
            println(i)
        }
    }
}