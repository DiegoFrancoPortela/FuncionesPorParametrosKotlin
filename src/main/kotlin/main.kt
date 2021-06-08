import kotlin.random.Random

fun main(args: Array<String>) {

    // ----------------------------- EJERCICIO 1 ----------------------------------
    println("EJERCICIO 1")
    println("")
    var i = 0
    for (x in Ejercicio1(11).tabla7){
        println("7 x $i = $x")
        i++
    }

    println("-----------")
    println()
    println("EJERCICIO 2")
    println("")
    // ----------------------------------------------------------------------------
    // ----------------------------- EJERCICIO 2 ----------------------------------

    var x = 1
    val tamañoArray = 10

    val claseRandom = Ejercicio2(tamañoArray){
        Random.nextInt(50,250)
    }

    claseRandom.nRandom.forEach {
        println("- $it")
        x++
    }

    println("-----------")
}