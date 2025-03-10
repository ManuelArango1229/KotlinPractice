/*
 *Autor: Juan Manuel Arango Rodas
 *Cod Estd: 2259571
 *Fecha: 2025-03-09
 *Descripción: Solución ejercicio 12
*/

fun main(args: Array<String>) {
    val child: Int = 5
    val adult: Int = 28
    val senior: Int = 87

    val isMonday: Boolean = true

    println("The movie ticket price for a person aged $child is $${ticketPrice(child, isMonday)}")
    println("The movie ticket price for a person aged $adult is $${ticketPrice(adult, isMonday)}")
    println("The movie ticket price for a person aged $senior is $${ticketPrice(senior, isMonday)}")
}

fun ticketPrice(
    age: Int,
    isMonday: Boolean,
): Int =
    when {
        age < 13 -> 15
        age >= 13 && age <= 65 -> if (isMonday) 25 else 30
        age >= 61 -> 20
        else -> 0
    }
