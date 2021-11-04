/**
 * Ejercicio 5.10
 * Queremos mantener una colección de los libros que hemos ido leyendo, poniéndoles una calificación según nos haya gustado más o menos al leerlo.
 * Para ello, crear la clase Libro, cuyos atributos son el título, el autor, el número de páginas y la calificación que le damos entre 0 y 10.
 * Crear los métodos para poder modificar y obtener los atributos (sólo si tienen sentido).
 * Posteriormente, crear una clase ConjuntoLibros, que almacena un conjunto de libros (con un vector de un tamaño fijo).
 * Se pueden añadir libros que no existan (siempre que haya espacio), eliminar libros por título o autor, mostrar por pantalla los libros
 * con la mayor y menor calificación y, por último, mostrar un contenido de todo el conjunto.
 * En el programa principal realizar las siguientes operaciones: crear dos libros, añadirlos al conjunto, eliminarlos por los dos criterios (título y autor)
 * hasta que el conjunto esté vacío, volver a añadir un libro y mostrar el contenido final.
 */
class Libro(
    var titulo: String,
    var autor: String,
    var num_pagina: Int,
    var calificacion: Int
) {
    var check: Boolean = false
    var nuw_califi: Int = 0
    fun modificar(calif: Int): String {
        check = true
        nuw_califi = calif
        return "La antigua calificacion es de $calificacion y la nueva es de $calif"
    }

    fun obtener_datos(): String {
        if (calificacion > 10) {
            calificacion = 10
        } else if (calificacion < 0) {
            calificacion = 0
        }
        if (check) {
            calificacion = nuw_califi
        }
        return "Titulo: $titulo \n Autor: $autor \n Nº paginas: $num_pagina \n Calificacion: $calificacion"
    }
}

class ConjuntoLibros() {
    var vector_libros: Array<Libro?> = arrayOfNulls(8)
    fun insertar_libros(conjunto: Libro): String {
        if (vector_libros.size > 8) {
            println("Error a sobre pasado el limite de volumen en el vector")

        } else {
            var i: Int = 0
            var check: Int = 0
            while (check == 0) {
                when {
                    vector_libros[i] == null -> {
                        vector_libros[i] = conjunto
                        check = 1
                    }
                    vector_libros[i]!!.titulo == conjunto.titulo -> {
                        println("El titulo  ${conjunto.titulo} ya existe ")
                        check = 1
                    }
                    else -> {
                        i++
                    }
                }
            }
            return ""
        }
        return "d"
    }
    fun elimina_por_autor(autor_remove: String): Boolean{
        var mensaje: Boolean = false
        var i: Int = 0
        var check: Int = 0
        while (check == 0)
        {
            when {
                vector_libros[i]!!.autor == autor_remove -> {
                    vector_libros[i] = null
                    mensaje = true
                    check = 1
                    println("Los libros del autor $autor_remove han sido eliminado")
                }
                else -> {
                    i++
                }
            }
        }
        return mensaje
    }
    fun elimina_por_titulo(titulo_remove: String): Boolean{
        var mensaje: Boolean = false
        var i: Int = 0
        var check: Int = 0
        while (check == 0)
        {
            when {
                vector_libros[i]!!.titulo == titulo_remove -> {
                    vector_libros[i] = null
                    mensaje = true
                    check = 1
                    println("El libro con titulo $titulo_remove ha sido eliminado")
                }
                else -> {
                    i++
                }
            }
        }
        return mensaje
    }
    fun mostrar_conjunto(){
        var contador: Int = 1
        for (i in vector_libros){

            if (i != null){
                println("*".repeat(110))
                println("* \t \t \t \t \t \t \t \t\t Listado de libros \t \t \t \t \t                   \t \t \t \t \t *")
                println("*".repeat(110))
                println("* $contador. El titulo ${i.titulo} pertenece al autor ${i.autor}, tiene ${i.num_pagina} paginas y con una calificacion de ${i.nuw_califi} \t     *")
                println("*".repeat(110))
                contador++
            }
        }
    }
}