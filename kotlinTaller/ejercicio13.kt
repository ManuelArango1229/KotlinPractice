/*
 *Autor: Juan Manuel Arango Rodas
 *Cod Estd: 2259571
 *Fecha: 2025-03-09
 *Descripción: Solución ejercicio 13
*/

fun main(args: Array<String>) {
    val song1 = Song("La Cumparsita", "Carlos Gardel", 1916, 1000)
    song1.sonDescripton()
}

class Song(
    _title: String,
    _artist: String,
    _year: Int,
    _reproduccions: Int,
) {
    var title: String = _title
    var artist: String = _artist
    var year: Int = _year
    var reproduccions: Int = _reproduccions
    var popularity: String = ""

    init {
        println("Se ha creado la canción $title de $artist")
        if (reproduccions < 1000) {
            popularity = "Poco Popular"
        } else {
            popularity = "Popular"
        }
    }

    fun sonDescripton() {
        println("$title, interpretada por $artist se lanzó en $year")
    }
}
