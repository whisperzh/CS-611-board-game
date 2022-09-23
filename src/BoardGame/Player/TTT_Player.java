package BoardGame.Player;

import java.util.Scanner;

public class TTT_Player extends Player{

    public TTT_Player() {
        super();
    }

    public TTT_Player(String name) {
        super(name);
    }

    @Override
    public void Input(Integer x, Integer y) {
        InitScanner();
        x=GetScanner().nextInt();
        y=GetScanner().nextInt();
    }


}
