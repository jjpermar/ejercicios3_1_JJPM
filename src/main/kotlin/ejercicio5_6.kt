/**
 *                                                               Ejercicio 5.6
 *Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y los métodos para calcular el área y el perímetro.
 *Opcionalmente se puede crear el método toString para mostrar información sobre el rectángulo.
 *En el programa principal, crear varios rectángulos y mostrar por pantalla sus áreas y perímetros.
  * */
class Rectangulo(var base: Double, var altura: Double) {
    fun area(): Double {
        var resultado_area: Double
        resultado_area = base * altura
        return resultado_area
    }

    fun perimetro(): Double {
        var resultado_perimetro: Double
        resultado_perimetro = (base * 2) + (altura * 2)
        return resultado_perimetro
    }

    override fun toString(): String {
        var contenido =
            " \n La base es: $base cm \n La altura es: $altura cm \n El area es $base cm X $altura cm = ${this.area()} cm \n El perimetro es ($base cm X 2) + ($altura cm X 2) = ${this.perimetro()} cm \n"
        return contenido
    }
}