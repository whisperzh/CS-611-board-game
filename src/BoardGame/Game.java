package BoardGame;

import java.util.List;

public class Game {
    private int size;
    private int playerNum;
    private List<Player> playerList;

    public int GetPlayerNum(){
        return playerList.size();
    }
    public Game ()
    {
        size=3;
        playerNum=2;
    }

    public Game(int boardSize) {
        size=boardSize;

    }
}
