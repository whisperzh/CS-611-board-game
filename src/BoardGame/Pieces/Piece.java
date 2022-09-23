package BoardGame.Pieces;

import BoardGame.Player.Player;

public class Piece {
    private boolean isActivated;
    public Piece(){}
    private int posx,posy;
    private char pieceType;

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public char getPieceType() {
        return pieceType;
    }

    public void setPieceType(char pieceType) {
        this.pieceType = pieceType;
    }

    public void activate(char teamPieceType) {
        isActivated=true;
        pieceType=teamPieceType;
    }
}
