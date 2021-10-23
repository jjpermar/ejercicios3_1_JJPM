import javax.management.monitor.MonitorSettingException

/**
 * Ejercicio 5.8
 *Crear una clase Tiempo, con atributos hora, minuto y segundo, que pueda ser construida indicando los tres atributos,
 *sólo hora y minuto o sólo la hora (si no se indica, el valor de minuto o segundo será 0).
 *Crear el método toString para mostrar el tiempo en formato: XXh XXm XXs
 *En el programa principal, debe solicitar por teclado hora, minuto y segundo de forma que se puedan omitir los segundos o los minutos
 *(y segundos, claro) e instancie la clase Tiempo mostrando su valor.
 */
class Tiempo(
    h: String,
    m: String?,
    s: String?

) {
    var hora: String = h
    var minuto: String? = m
        set(min) {
            if (min == ""){
                field = "0"
            }
        }
    var segundos: String? = s
        get() = field
        set(seg) {
            if(seg == ""){
                field = "0"
            }
        }

    override fun toString(): String {
        return "$hora h $minuto m $segundos s"
    }
}