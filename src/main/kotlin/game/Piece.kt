package game

import kotlin.random.Random

open class Piece {
    open val home: Int = 0
    open val colour: String = ""
    var place: Int = home

    fun move(): Int  {
        val result = Random.nextInt(1,6)
        place += result
        return result
    }

    open fun checkIfBack(): Boolean {return true}

    fun checkPiece(piece: Piece): Boolean {
        return piece.colour.equals(colour)
    }
}
