/*
 *Autor: Juan Manuel Arango Rodas
 *Cod Estd: 2259571
 *Fecha: 2025-03-08
 *Descripción: Solución ejercicio 6
*/

fun main(args: Array<String>) {
    val array: Array<String> = arrayOf("Ana", "Luis", "Carlos", "Maria")
    println("Ingrese el nombre que desa buscar: ")
    val find = readLine()
    if (array.contains(find)) {
        println("El nombre $find se encuentra en el arreglo")
    } else {
        println("El nombre $find no se encuentra en el arreglo")
    }
}
