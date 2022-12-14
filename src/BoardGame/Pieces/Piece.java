package BoardGame.Pieces;

public class Piece {
    private boolean isActivated;
    private char pieceType=' ';

    public int getDisplayIndex() {
        return displayIndex;
    }

    private int displayIndex;

    public Piece(int displayIndex){
        this.displayIndex=displayIndex;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public void activate(char teamPieceType) {
        isActivated=true;
        pieceType=teamPieceType;
    }

    public char getPieceType() {
        return pieceType;
    }

    public void setPieceType(char pieceType) {
        this.pieceType = pieceType;
    }

    public void reset(){
        setActivated(false);
        pieceType=' ';
    }

}
