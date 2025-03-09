/*
 *Autor: Juan Manuel Arango Rodas
 *Cod Estd: 2259571
 *Fecha: 2025-03-08
 *Descripción: Solución ejercicio 10
 */

fun combinarArrays(
    array1: Array<Int>,
    array2: Array<Int>,
): Array<Int> = array1 + array2

fun main(args: Array<String>) {
    val array: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val array2: Array<Int> = arrayOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
    val combinado: Array<Int> = combinarArrays(array, array2)
    println("Array combinado: ${combinado.joinToString(", ")}")
}
