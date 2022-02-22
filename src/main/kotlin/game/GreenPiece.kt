package game

class GreenPiece : Piece() {
    override val home: Int = 1
    override val colour: String = "GREEN"

    override fun checkIfBack(): Boolean {
        if (41 - place >= 1) {
            place = 40
            return true
        }
        return false
    }
}
