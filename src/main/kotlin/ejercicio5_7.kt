/**
 *                                                  Ejercicio 5.7
 * Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca, el modelo, el número de caballos, el número de puertas y la matrícula.
 * Crear el constructor del coche, así como los métodos estándar: ¿getters, setters? y toString.
 *En el programa principal, instancia varios coches, muestra su información, cambia el color a algunos de ellos y vuelve a mostrarlos por pantalla
 */

class Coche(
    var color: String,
    var modelo: String,
    var marca: String,
    var caballos: Int,
    var puertas: Int,
    var matricula: String
) {
    override fun toString(): String {
        return "\n + Su coche es un $marca $modelo de color $color, tiene $caballos caballos, con $puertas puertas y su matricula seria $matricula"
    }
}