/*
 *Autor: Juan Manuel Arango Rodas
 *Cod Estd: 2259571
 *Fecha: 2025-03-08
 *Descripción: Solución ejercicio 16
 */

open class Phone(
    var isScreenLightOn: Boolean = false,
) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(
    var isFolded: Boolean = true,
) : Phone() {
    override fun switchOn() {
        if (!isFolded) {
            super.switchOn()
        } else {
            println("No se puede encender la pantalla mientras el teléfono está plegado.")
        }
    }

    fun toggleFold() {
        isFolded = !isFolded
        println("El teléfono ahora está ${if (isFolded) "plegado" else "desplegado"}.")
    }
}

fun main() {
    val telefono = FoldablePhone()
    telefono.switchOn()
    telefono.toggleFold()
    telefono.switchOn()
    telefono.checkPhoneScreenLight()
}
