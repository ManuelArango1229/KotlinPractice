/*
 *Autor: Juan Manuel Arango Rodas
 *Cod Estd: 2259571
 *Fecha: 2025-03-08
 *Descripción: Solución ejercicio 15
 */
class Person(
    val name: String,
    val age: Int,
    val hobby: String?,
    val referrer: Person?,
) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        if (hobby != null) {
            print("Likes to $hobby.")
        }
        if (referrer != null) {
            println(" Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.")
        } else {
            println(" Doesn't have a referrer.")
        }
    }
}

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}
