/*
 *Autor: Juan Manuel Arango Rodas
 *Cod Estd: 2259571
 *Fecha: 2025-03-08
 *Descripción: Solución ejercicio 9
*/

fun main(args: Array<String>) {
    val array: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    array.forEach { x -> if (x % 2 == 0) println("El número $x es par") else println("El número $x es impar") }
}
