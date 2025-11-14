object main {
  def main(args: Array[String]): Unit = {
    /*  Primer ejercicio */
    def mymethod(datos: List[Double]): Double = {
      val logs = datos.map(math.log)
      val promedioLog = logs.sum / logs.size
      val suma = logs.map { x =>
        val diferencia = x - promedioLog
        diferencia * diferencia
      }.sum
      math.sqrt(suma / logs.size)
    }


    /* Segundo ejercicio  */
    def ajustarPrecios(precios: List[Double])(politica: Double => Double): List[Double] =
      precios.map(politica)

    val lista = List(100.0, 200.0, 350.0)

    val iva = (p: Double) => p * 1.19
    val descuento = (p: Double) => p * 0.90

    println(ajustarPrecios(lista)(iva))
    println(ajustarPrecios(lista)(descuento))

    /* Tercer Ejercicio*/
    def generadorIncrementador(incremento: Int): Int => Int =
      x => x + incremento
  }
}




