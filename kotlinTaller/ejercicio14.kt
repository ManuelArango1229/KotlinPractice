/*
 *Autor: Juan Manuel Arango Rodas
 *Cod Estd: 2259571
 *Fecha: 2025-03-08
 *Descripción: Solución ejercicio 14
 */

fun main() {
    printFinalTemperature(32.0, "C", "F", ::celsuisToFahrenheit)
    printFinalTemperature(32.0, "K", "C", ::kelvinToCelsius)
    printFinalTemperature(32.0, "F", "K", ::fahreheitToKelvin)
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double,
) {
    val finalMeausurement = String.format("%.2f", conversionFormula(initialMeasurement))
    println("$initialMeasurement $initialUnit is equal than $finalMeausurement $finalUnit")
}

fun celsuisToFahrenheit(celsius: Double): Double = celsius * 9 / 5 + 32

fun kelvinToCelsius(kelvin: Double): Double = kelvin - 273.15

fun fahreheitToKelvin(fahrenheit: Double): Double = (fahrenheit - 32) * 5 / 9 + 273.15
