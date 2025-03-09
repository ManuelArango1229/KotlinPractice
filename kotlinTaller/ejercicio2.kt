/*
 *Autor: Juan Manuel Arango Rodas
 *Cod Estd: 2259571
 *Fecha: 2025-03-08
 *Descripción: Solución ejercicio 2
 */
fun main() {
    println("Ingrese un número entero: ")
    val number1 = readLine()!!.toFloat()
    println("Ingrese otro número entero: ")
    val number2 = readLine()!!.toFloat()

    println(
        """
  La suma de $number1 y $number2 es ${number1 + number2}
  La resta de $number1 y $number2 es ${number1 - number2}
  La multiplicación de $number1 y $number2 es ${number1 * number2}
  La división de $number1 y $number2 es ${number1 / number2}
  """,
    )
}
