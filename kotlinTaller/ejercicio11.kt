/*
 *Autor: Juan Manuel Arango Rodas
 *Cod Estd: 2259571
 *Fecha: 2025-03-09
 *Descripción: Solución ejercicio 11
*/

fun main(args: Array<String>) {
    val morningNotification: Int = 51
    val eveningNotification: Int = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(notification: Int) {
    when (notification) {
        in 1..99 -> println("You have $notification notifications")
        in 101..150 -> println("You phone is blowing up! you have  99+ notifications")
        else -> println("Unknown notification")
    }
}
