package TestPieces

import game.*
import org.junit.jupiter.api.Test
import org.testng.annotations.BeforeTest
import kotlin.test.assertEquals

class TestPiece {

    lateinit var green: GreenPiece
    lateinit var board: ArrayList<Piece>


    @BeforeTest
    fun beforeTest() {
        green = GreenPiece()
        board = ArrayList()
        for (i in 1..4) {
            board.add(GreenPiece())
            board.add(RedPiece())
            board.add(YellowPiece())
            board.add(BluePiece())
        }
    }

    @Test
    fun testMove() {
        val move = green.move()
        assertEquals(move, green.place)
    }

    @Test
    fun testIsBack() {
        assertEquals(true, green.checkIfBack())
        green.move()
        assertEquals(false, green.checkIfBack())
    }
}