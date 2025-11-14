object main {
  def main(args: Array[String]): Unit = {
    /*  Primer ejercicio */
    def mymethod(datos: List[Double]): Double = { /* Recibe la lista de double y devuelve un double */
      val Logs = datos.map(math.log)             /* Transforma cada dato a su logaritmo natural */
      val promedioLog = Logs.sum / Logs.size     /* Calcula el promedio del logaritmos */
      val suma = Logs.map(x => {                 /* Mapea cada log para obtener su cuadrado de la diferencia */
        val diferencia = x - promedioLog         /* Diferencia de cada log respecto a la media */
        diferencia * diferencia                  /* Cuadrado de la diferencia */
      }).sum                                     /* Suma todos los cuadrados */
      suma / Logs.size                           /* Devuelve la varianza del promedio de los cuadrados */
    }

    /* Segundo ejercicio  */
    val lista = List(100.0, 200.0, 350.0)              /*  lista de precios */
    val iva: Double => Double = p => p * 1.19          /* Política de la tienda : aplicar IVA del 19% */
    val descuento: Double => Double = p => p * 0.90       /* Política de la tienda : aplicar descuento del 10% */
    def precios(precios: List[Double],                 /* Funcion recibe lista de precios */
                politica_tienda: Double => Double): List[Double] = { /* y la política de la tienda para ajustar el precio */
      precios.map(politica_tienda)                                /* Aplica la política a cada precio y devuelve nueva lista */
    }
    val ivap = precios(lista, iva)                   /* Aplica política del iva a la lista */
    val descuentop = precios(lista, descuento)          /* Aplica política descuento a la lista */
    println(s"precio original: $lista")                /* Muestra el precio original */
    println(s"iva: $ivap")                       /* Muestra el precio con iva */
    println(s"descuento  $descuentop")           /* Muestra el precio con el descuento del 10% */

    /* Tercer Ejercicio*/
    def generadorIncrementador(nombre1: Int): Int => Int =     /* Funcion con nombre1 */
      (nombre2: Int) => nombre2 + nombre1                      /* Funcion resultante: suma el incremento capturado al argumento que es nombre2 */
    
  }
}




