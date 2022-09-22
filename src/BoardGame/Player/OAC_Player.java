package BoardGame.Player;

import java.util.ArrayList;

public class OAC_Player extends Player{
    public OAC_Player(){
        super();
    }

    public OAC_Player(String name) {
        super(name);
    }

    @Override
    public boolean ValidMove(int x, int y) {
        return false;
    }

}
