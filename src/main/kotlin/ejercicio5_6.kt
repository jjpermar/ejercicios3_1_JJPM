class Rectangulo(var base: Double, var altura: Double){
  fun area(): Double {
      var resultado_area: Double
      resultado_area = base*altura
      return resultado_area
  }
  fun perimetro(): Double{
      var resultado_perimetro: Double
      resultado_perimetro = (base*2)+(altura*2)
      return resultado_perimetro
  }

    override fun toString(): String {
        var contenido = " La base es: $base cm \n La altura es: $altura cm \n El area es $base X $altura = ${this.area()} cm \n El perimetro es ($base X 2) + ($altura X 2) = ${this.perimetro()} cm"
        return contenido
    }
}