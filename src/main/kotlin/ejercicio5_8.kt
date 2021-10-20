/**
 * Ejercicio 5.8
 *Crear una clase Tiempo, con atributos hora, minuto y segundo, que pueda ser construida indicando los tres atributos,
 *sólo hora y minuto o sólo la hora (si no se indica, el valor de minuto o segundo será 0).
 *Crear el método toString para mostrar el tiempo en formato: XXh XXm XXs
 *En el programa principal, debe solicitar por teclado hora, minuto y segundo de forma que se puedan omitir los segundos o los minutos
 *(y segundos, claro) e instancie la clase Tiempo mostrando su valor.
 */
class Tiempo(
    var hora: Int?,
    var minuto: Int?,
    var segundos: Int?
) {

        override fun toString(): String {
        return "$hora h $minuto m $segundos s"
    }
}