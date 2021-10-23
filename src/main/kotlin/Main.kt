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
    coche2.color = "Gris"
    println("$coche1")
    println("$coche2")

    //Tercer ejercicio 5.8
    println("==".repeat(40))
    println("\t \t \t \t Ejercicio 5.8")
    print("Escriba las horas: ")
    var hors: String = readLine().toString() as String
    if (hors == "") {
        println("Error: debes de escribir una hora...")
    } else {
        print("Escriba los minutos: ")
        var min: String? = readLine()?.toString() as String
        print("Escriba los segundos: ")
        var segund: String? = readLine()?.toString() as String
        var tiempo1 = Tiempo(hors, min, segund)
        tiempo1.hora = hors
        tiempo1.minuto = min
        tiempo1.segundos = segund
        println("$tiempo1")
    }
}