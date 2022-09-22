package BoardGame.Player;

public class TTT_Player extends Player{

    public TTT_Player() {
        super();
    }

    public TTT_Player(String name) {
        super(name);
    }

    @Override
    public boolean ValidMove(int x, int y) {
        return false;
    }

}
