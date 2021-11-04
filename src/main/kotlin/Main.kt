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

    //Cuerto ejercicio 5.9
    println("==".repeat(40))
    println("\t \t \t \t Ejercicio 5.9")
    var cuenta1 = Cuenta("cuenta1", 00.00)
    var cuenta2 = Cuenta("cuenta2",700.00)
    var pepe = Persona("20074034M")
    var creacion_de_cuentas = listOf<Cuenta>(cuenta1, cuenta2)
    creacion_de_cuentas.forEach{println(pepe.insertar_cuentas(it))}
    cuenta1.recibir_abono(1000.00)
    cuenta2.realizar_pago(750.00)
    println(pepe.moroso())
    cuenta1.realizar_pago(500.00)
    cuenta2.recibir_abono(500.00)
    println(pepe.moroso())

    //Cuerto ejercicio 5.9
    println("==".repeat(40))
    println("\t \t \t \t Ejercicio 5.10")
    var libro1 = Libro("La oscuridad","jhony", 100, -15)
    var libro2 = Libro("La oscuridad 2","paco", 100, -15)
    var creacion_de_libros = listOf<Libro>(Libro("sas","aaa",11,15), libro1)
    var conj = ConjuntoLibros()
    creacion_de_libros.forEach{println(conj.insertar_libros(it))}
    conj.elimina_por_autor("jhony")
    conj.elimina_por_titulo("sas")
    creacion_de_libros = listOf<Libro>(libro2)
    creacion_de_libros.forEach{println(conj.insertar_libros(it))}
    conj.mostrar_conjunto()

}