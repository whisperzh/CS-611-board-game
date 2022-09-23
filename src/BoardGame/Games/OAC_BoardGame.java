package BoardGame.Games;

import BoardGame.Player.OAC_Player;
import BoardGame.Player.Player;
import BoardGame.Player.TTT_Player;

import java.util.ArrayList;
import java.util.LinkedList;

public class OAC_BoardGame extends BoardGame{
    public OAC_BoardGame() {
        super();
    }

    public void InitPlayer(){
        if(playerList==null)
            playerList=new LinkedList<Player>();
        for (int i=0;i<playerNum;i++)
            playerList.add(new OAC_Player(new String("Player")+Integer.toString(i+1)));
    }

    @Override
    public void constructLogicGrid() {

    }

    @Override
    public void PlayRounds() {

    }
}
