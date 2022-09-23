package BoardGame.Pieces;

import BoardGame.Player.Player;

public abstract class Piece {
    private boolean ocupied;
    public Piece(){}
    protected Player owner;
    private char icon;
    public char getIcon() {
        return icon;
    }

    public void setIcon(char icon) {
        if(!ocupied)
            this.icon = icon;
    }

    public boolean isOcupied() {
        return ocupied;
    }

    public void setOcupied(boolean ocupied) {
        this.ocupied = ocupied;
    }

}
