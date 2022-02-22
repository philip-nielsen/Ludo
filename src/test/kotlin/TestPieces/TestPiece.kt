package TestPieces

import game.GreenPiece
import org.junit.jupiter.api.Test
import org.testng.annotations.BeforeTest
import kotlin.test.assertEquals

class TestPiece {

    val green = GreenPiece()

    @BeforeTest
    fun beforeTest() {

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