package game

data class GreenPiece(val home: Int, val colour: Int, override var place: Int) : Piece(home, colour, place) {
    //home = 0
    //colour: Int = 1
//    this.place: Int = 0
}
