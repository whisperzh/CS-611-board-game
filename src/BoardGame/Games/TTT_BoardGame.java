package BoardGame.Games;

import BoardGame.Pieces.Piece;
import BoardGame.Pieces.TTT_Piece;
import BoardGame.Player.Player;
import BoardGame.Player.TTT_Player;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TTT_BoardGame extends BoardGame{
    public TTT_BoardGame(){
        super();
    }

    public void InitPlayer(){
        if(playerList==null)
            playerList=new LinkedList<>();
        for (int i=0;i<playerNum;i++)
            playerList.add(new TTT_Player(new String("Player")+Integer.toString(i+1)));
    }

    @Override
    public void constructLogicGrid() {
        boardLogicGrid=new ArrayList<List<Piece>>();
        for(int i=0;i<size;i++)
        {
            boardLogicGrid.add(new ArrayList<Piece>());
            for(int j=0;j<size;j++)
                boardLogicGrid.get(i).add(new TTT_Piece());
        }

    }

    @Override
    public void Player() {

    }


}

