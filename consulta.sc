////EJERCICIO 1///
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  val x1 = (a + b) /2

  val resultado = (b-a) * ((f(a) + 4 * f(x1) + f(b))/6)
  resultado
}
////EJERCICIO 2///
val a = -1.0
val b = 1.0
def funcion1(x: Double): Double = -x * x + 8 * x - 12
def funcion2(x: Double): Double = 3 * x * x
def funcion3(x: Double): Double = x + (2 * x * x) + (5 * x * x * x * x) - (x * x * x)
def funcion4(x: Double): Double = (2 * x + 1) / (x * x + x)
def funcion5(x: Double): Double = math.exp(x)
def funcion6(x: Double): Double = 1/ (math.sqrt(x-1))
def funcion7(x: Double): Double = 1 / (1 + x * x)

val resultado = integracion(a, b, funcion3)

///EJERCICIO 3///
val valorEsperado3 = 3.333
val valorEsperado4 = 1.09861
val valorEsperado5 = 1.71828
val valorEsperado6 = 0.828427
val valorEsperado7 = 0.785398

def calcularError(valorEsperado3: Double, resultado: Double): Double = {
  math.abs(valorEsperado3 - resultado)
}

val error = calcularError(valorEsperado3, resultado)
val valorReal = resultado - error


