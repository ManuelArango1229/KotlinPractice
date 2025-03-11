/*
 *Autor: Juan Manuel Arango Rodas
 *Cod Estd: 2259571
 *Fecha: 2025-03-08
 *Descripción: Solución ejercicio 17
 */
fun main() {
    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Bid(
    val amount: Int,
    val bidder: String,
)

fun auctionPrice(
    bid: Bid?,
    minimumPrice: Int,
): Int = bid?.amount ?: minimumPrice
