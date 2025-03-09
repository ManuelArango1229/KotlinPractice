/*
 *Autor: Juan Manuel Arango Rodas
 *Cod Estd: 2259571
 *Fecha: 2025-03-08
 *Descripción: Solución ejercicio 8
*/
fun main(args: Array<String>) {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 11, 7, 8, 9, 10)
    println("El máximo del array es: ${encontrarMaximo(array)}")
}

fun encontrarMaximo(array: Array<Int>): Int = array.reduce { x, y -> if (x > y) x else y }
