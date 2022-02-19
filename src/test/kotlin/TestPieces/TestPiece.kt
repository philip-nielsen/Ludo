package TestPieces

import game.GreenPiece
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestPiece {

    val green = GreenPiece(0,1,0)

//    @BeforeTest
//    fun beforeTest() {
//
//    }

    @Test
    fun testMove() {
        val move = green.move()
        assertEquals(move, green.place)
    }
}