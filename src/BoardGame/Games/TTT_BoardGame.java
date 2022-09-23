package BoardGame.Games;

import BoardGame.Pieces.TTT_Piece;
import BoardGame.Player.TTT_Player;

import java.util.LinkedList;

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
        boardLogicGrid=new TTT_Piece[size][size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
                boardLogicGrid[i][j]=new TTT_Piece();
        }

    }
    private boolean Valid(int x,int y){
        if(boardLogicGrid[x][y].isOcupied())
        {
            return false;
        }
        return true;
    }

    @Override
    public void PlayRounds() {
        while(GameOver()==false) {
            Integer x = 0, y = 0;
            TTT_Player tp = (TTT_Player) playerList.poll();
            tp.Input(x, y);
            while (!Valid(x, y)) {
                System.out.println("Invalid input, please input again");
                tp.Input(x, y);
            }
            playerList.add(tp);
        }
    }
    //false==game not over
    public boolean GameOver(){
        return false;
    }


}

