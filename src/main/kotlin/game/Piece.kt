package game

import kotlin.properties.Delegates
import kotlin.random.Random

open class Piece(home: Int, colour: Int, place: Int) {
    open var place by Delegates.notNull<Int>()
    fun move(): Int  {
        val result = Random.nextInt(1,6)
        place += result
        return result
    }
}
