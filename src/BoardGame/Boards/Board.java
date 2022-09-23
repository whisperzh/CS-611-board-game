package BoardGame.Boards;

import BoardGame.Pieces.Piece;

public class Board {
    protected int size;
    protected int playerNum;
    protected int rounds;
    protected char [][] boardGraphicalGrid;
    protected Piece[][] boardLogicGrid;
    private char currPieceType;
    private int inputBuffer;

    public Board()
    {
        size=3;
        playerNum=2;
        rounds =1;
        constructGraphicsGrid();
        constructLogicGrid();
    }

    public Board(int boardSize) {
        size=boardSize;
        playerNum=2;
        rounds =1;
        constructGraphicsGrid();
        constructLogicGrid();
    }

    public void constructLogicGrid(){
        boardLogicGrid=new Piece[size][size];
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
            {
                boardLogicGrid[i][j]=new Piece();
            }
    }

    public void constructGraphicsGrid(){
        int row=1+size*2;
        int col=1+size*3;
        boardGraphicalGrid =new char[row][col];
        for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                boardGraphicalGrid[i][j]=' ';
            }
        }
        for(int r=0;r<row-1;r+=2) {
            for (int i = 0; i < col-1; i += 3) {
                boardGraphicalGrid[r][i] = '+';
                boardGraphicalGrid[r+2][i] = '+';
                boardGraphicalGrid[r][i+3] = '+';
                boardGraphicalGrid[r+2][i+3] = '+';

                boardGraphicalGrid[r+1][i] = '|';
                boardGraphicalGrid[r+1][i+3] = '|';

                boardGraphicalGrid[r][i+1] = '-';
                boardGraphicalGrid[r][i+2] = '-';

                boardGraphicalGrid[r+2][i+1] = '-';
                boardGraphicalGrid[r+2][i+2] = '-';
            }
        }

    }

    public void printGrid(){
        int m= boardGraphicalGrid.length;
        int n= boardGraphicalGrid[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(boardGraphicalGrid[i][j]);
            }
            System.out.println();
        }


    }

    public char getCurrType() {
        return currPieceType;
    }

    public void setGrid(int x, char teamPieceType) {
        int row=x/size;
        int col=x%size;
        boardLogicGrid[row][col].activate(teamPieceType);
        currPieceType=teamPieceType;
        updateGraphicalGrid(row,col);
    }

    private void updateGraphicalGrid(int x,int y) {
        int mappedx=2*x+1;
        int mappedy=3*y-2;
        boardGraphicalGrid[mappedx][mappedy]=currPieceType;
    }

    public boolean validSet(int x){
        int row=(x-1)/size;
        int col=(x-1)%size;
        if(boardLogicGrid[row][col].isActivated())
            return false;
        return true;
    }

    public int currNumOfPieceinAllDir(int x){
        int row=(x-1)/size;
        int col=(x-1)%size;
        return 1;
    }
    public int currNumOfPieceinAllDir()
    {
        int row=(inputBuffer-1)/size;
        int col=(inputBuffer-1)%size;
        return 1;
    }
}
