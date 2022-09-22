package BoardGame.Games;

import BoardGame.Pieces.Piece;
import BoardGame.Player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public abstract class BoardGame {
    protected int size;
    protected int playerNum;
    protected Queue<Player> playerList;
    protected char [][] boardGraphicsGrid;
    protected List<List<Piece>> boardLogicGrid;
    public int GetPlayerNum(){
        return playerList.size();
    }

    public BoardGame()
    {
        size=3;
        playerNum=2;
        constructGraphicsGrid();
        InitPlayer();
        constructLogicGrid();
    }

    public BoardGame(int boardSize) {
        size=boardSize;
        constructGraphicsGrid();
        InitPlayer();
        constructLogicGrid();
    }

    public abstract void InitPlayer();

    public abstract void constructLogicGrid();

    public  abstract void Player();

    public void constructGraphicsGrid(){
        int row=1+size*2;
        int col=1+size*3;
        boardGraphicsGrid =new char[row][col];
        for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                boardGraphicsGrid[i][j]=' ';
            }
        }
        for(int r=0;r<row-1;r+=2) {
            for (int i = 0; i < col-1; i += 3) {
                boardGraphicsGrid[r][i] = '+';
                boardGraphicsGrid[r+2][i] = '+';
                boardGraphicsGrid[r][i+3] = '+';
                boardGraphicsGrid[r+2][i+3] = '+';

                boardGraphicsGrid[r+1][i] = '|';
                boardGraphicsGrid[r+1][i+3] = '|';

                boardGraphicsGrid[r][i+1] = '-';
                boardGraphicsGrid[r][i+2] = '-';

                boardGraphicsGrid[r+2][i+1] = '-';
                boardGraphicsGrid[r+2][i+2] = '-';
            }
        }

    }

    public void printGrid(){
        int m= boardGraphicsGrid.length;
        int n= boardGraphicsGrid[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(boardGraphicsGrid[i][j]);
            }
            System.out.println();
        }


    }

}
