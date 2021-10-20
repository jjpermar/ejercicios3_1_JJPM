fun main(args: Array<String>) {

    //Primer ejercicio 5.6
    println("==".repeat(40))
    println("\t \t \t \t Ejercicio 5.6")
    var rectangulo1 = Rectangulo(5.0, 10.0)
    var rectangulo2 = Rectangulo(10.0, 15.0)
    println("$rectangulo1")
    println("$rectangulo2")

    //Segundo ejercicio 5.7
    println("==".repeat(40))
    println("\t \t \t \t Ejercicio 5.7")
    var coche1 = Coche("Rojo", "106", "Peugeot", 90, 5, "804352B")
    var coche2 = Coche("Negro Metalico", "206", "Peugeot", 190, 5, "804352B")
    println("$coche1")
    println("$coche2")
    coche1.color = "Platino"
    coche1.matricula = "999994X"
    println("$coche1")
    println("$coche2")

    //Tercer ejercicio 5.8
    println("==".repeat(40))
    println("\t \t \t \t Ejercicio 5.8")
    var tiempo1 = Tiempo(10, 5, 10)
    println("$tiempo1")
}