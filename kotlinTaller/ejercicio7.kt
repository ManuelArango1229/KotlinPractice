/*
 *Autor: Juan Manuel Arango Rodas
 *Cod Estd: 2259571
 *Fecha: 2025-03-08
 *Descripción: Solución ejercicio 7
*/

fun main(args: Array<String>) {
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val duplicates: Array<Int> = numbers.map { it * 2 }.toTypedArray()
    println("Array original: ${numbers.joinToString(", ")}")
    println("Array modificado: ${duplicates.joinToString(", ")}")
}
