/*
 *Autor: Juan Manuel Arango Rodas
 *Cod Estd: 2259571
 *Fecha: 2025-03-08
 *Descripción: Solución ejercicio 6
 */
fun main(args: Array<String>) {
    val numeros: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(sumarArray(numeros))
}

fun sumarArray(array: Array<Int>): Int {
    var suma = 0
    for (i in array) {
        suma += i
    }
    return suma
}
