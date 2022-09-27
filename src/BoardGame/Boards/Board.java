package BoardGame.Boards;

import BoardGame.Pieces.Piece;

public class Board {

    protected int size;
    protected int playerNum;
    protected char [][] boardGraphicalGrid;
    protected char [][] indexDisplayboard;
    protected Piece[][] boardLogicGrid;
    private char currPieceType;
    protected int inputBuffer;
    protected char inputPieceTypeBuffer;

    protected int occupation;// flag to judge draw

    public void setInputBuffer(int inputBuffer) {
        this.inputBuffer = inputBuffer;
    }

    public void setInputBuffer(int inputBuffer,char inputPieceTypeBuffer) {
        this.inputBuffer = inputBuffer;
        this.inputPieceTypeBuffer=inputPieceTypeBuffer;
    }

    public Board()
    {
        size=3;
        playerNum=2;
        occupation=0;
        constructLogicGrid();
        constructGraphicsGrid();

    }

    public Board(int boardSize) {
        size=boardSize;
        playerNum=2;
        occupation=0;
        constructLogicGrid();
        constructGraphicsGrid();
    }

    public void constructLogicGrid(){
        boardLogicGrid=new Piece[size][size];
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
            {
                boardLogicGrid[i][j]=new Piece(i*size+j+1);
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

        indexDisplayboard=new char[row][col];

        for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                indexDisplayboard[i][j]=' ';
            }
        }
        for(int r=0;r<row-1;r+=2) {
            for (int i = 0; i < col-1; i += 3) {
                indexDisplayboard[r][i] = '+';
                indexDisplayboard[r+2][i] = '+';
                indexDisplayboard[r][i+3] = '+';
                indexDisplayboard[r+2][i+3] = '+';

                indexDisplayboard[r+1][i] = '|';
                indexDisplayboard[r+1][i+3] = '|';

                indexDisplayboard[r][i+1] = '-';
                indexDisplayboard[r][i+2] = '-';

                indexDisplayboard[r+2][i+1] = '-';
                indexDisplayboard[r+2][i+2] = '-';
            }
        }

        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
            {
                int mapx=2*i+1;
                int mapy=3*j+1;
                int idx=boardLogicGrid[i][j].getDisplayIndex();
                if(idx<=9)
                    indexDisplayboard[mapx][mapy]=(char) (idx+'0');
                else{

                    indexDisplayboard[mapx][mapy]=(char) (idx/10+'0');
                    indexDisplayboard[mapx][mapy+1]=(char) (idx%10+'0');
                    }
            }
    }

    public int getSize() {
        return size;
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
    public void displayBoardIndex(){
        int m= indexDisplayboard.length;
        int n= indexDisplayboard[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(indexDisplayboard[i][j]);
            }
            System.out.println();
        }


    }

    public char getCurrType() {
        return currPieceType;
    }

    public void setGrid(int x, char targetPieceType) {
        int row=(x-1)/size;
        int col=(x-1)%size;
        boardLogicGrid[row][col].activate(targetPieceType);
        currPieceType=targetPieceType;
        updateGraphicalGrid(row,col);
        occupation++;
    }

    private void updateGraphicalGrid(int x,int y) {
        int mappedx=2*x+1;
        int mappedy=3*y+1;
        boardGraphicalGrid[mappedx][mappedy]=currPieceType;
    }


    public boolean validSet(int x){
        if(x<1||x>size*size) {
            System.out.println("Your Input is Invalid");
            return false;
        }
        int row=(x-1)/size;
        int col=(x-1)%size;
        if(boardLogicGrid[row][col].isActivated()){
            System.out.println("Your Input is Invalid");
            return false;
        }
        return true;
    }

    public int currNumOfPieceinAllDir(int x){
        int row=(x-1)/size;
        int col=(x-1)%size;
        char pieceType=boardLogicGrid[row][col].getPieceType();
        //left check
        int ans=1;
        int horans=1;
        int verans=1;

        for(int i=col-1;i>=0;i--)
        {
            if(boardLogicGrid[row][i].getPieceType()==pieceType)
                horans++;
            else
                break;
        }

        for(int i=col+1;i<size;i++)
        {
            if(boardLogicGrid[row][i].getPieceType()==pieceType)
                horans++;
            else
                break;
        }

        for(int i=row-1;i>=0;i--)
        {
            if(boardLogicGrid[i][col].getPieceType()==pieceType)
                verans++;
            else
                break;
        }

        for(int i=row+1;i<size;i++)
        {
            if(boardLogicGrid[i][col].getPieceType()==pieceType)
                verans++;
            else
                break;
        }
        ans=Math.max(verans,horans);
        int crossans1=1;
        int crossans2=1;
        //left up
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
        {
            if(boardLogicGrid[i][j].getPieceType()==pieceType)
                crossans1++;
            else
                break;
        }

        //right down
        for(int i=row+1,j=col+1;i<size&&j<size;i++,j++)
        {
            if(boardLogicGrid[i][j].getPieceType()==pieceType)
                crossans1++;
            else
                break;
        }
        ans=Math.max(ans,crossans1);

        //right up
        for(int i=row-1,j=col+1;i>=0&&j<size;i--,j++)
        {
            if(boardLogicGrid[i][j].getPieceType()==pieceType)
                crossans2++;
            else
                break;
        }

        //left down
        for(int i=row+1,j=col-1;i<size&&j>=0;i++,j--)
        {
            if(boardLogicGrid[i][j].getPieceType()==pieceType)
                crossans2++;
            else
                break;
        }
        ans=Math.max(ans,crossans2);
        return ans;
    }

    public int currNumOfPieceinAllDir()
    {
        return currNumOfPieceinAllDir(inputBuffer);
    }

    public void reset() {
        currPieceType='~';
        occupation=0;
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
                boardLogicGrid[i][j].reset();
        constructGraphicsGrid();
    }

    public boolean stalemateCheck() {
        if(occupation==size*size)
            return true;
        return false;
    }

    public boolean boardGameWinnerJudgment()
    {
        return false;
    }
}
