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
){
    var check: Boolean = false
    var nuw_califi: Int = 0
    fun modificar(calif: Int): String{
        check = true
        nuw_califi = calif
        return "La antigua calificacion es de $calificacion y la nueva es de $calif"
    }
    fun obtener_datos(): String{
        if (check){
            calificacion = nuw_califi
        }
        return "Titulo: $titulo \n Autor: $autor \n Nº paginas: $num_pagina \n Calificacion: $calificacion"
    }
}