package game

import kotlin.random.Random

open class Piece {
    open val home: Int = 0
    open val colour: String = ""
    var place: Int = home

    fun move(): Int  {
        val result = Random.nextInt(1,6)
        for (i in 1 .. result) {
            place++
        }
        return result
    }

    fun checkIfBack(): Boolean {
        return place == home
    }

    fun checkPiece(piece: Piece): Boolean {
        return piece.colour.equals(colour)
    }
}
