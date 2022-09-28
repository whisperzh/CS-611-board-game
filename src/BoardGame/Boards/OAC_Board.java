package BoardGame.Boards;

import BoardGame.Pieces.OAC_Piece;

public class OAC_Board extends Board{
    public OAC_Board() {
        size=6;
        playerNum=2;
        occupation=0;
        constructLogicGrid();
        constructGraphicsGrid();
    }

    public void constructLogicGrid(){
        boardLogicGrid=new OAC_Piece[size][size];
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
            {
                boardLogicGrid[i][j]=new OAC_Piece(i*size+j+1);
            }
    }



    public void setInputBuffer(int inputBuffer,char inputPieceTypeBuffer) {
        this.inputBuffer = inputBuffer;
        this.inputPieceTypeBuffer=inputPieceTypeBuffer;
    }

    public void setGrid(int x, char targetPieceType) {
        int row=(x-1)/size;
        int col=(x-1)%size;
        boardLogicGrid[row][col].activate(targetPieceType);
        currPieceType=targetPieceType;
        updateGraphicalGrid(row,col);
        occupation++;
    }

    public boolean boardGameWinnerJudgment()
    {
        if(currNumOfPieceinAllDir()>=size-1)
            return true;
        return false;
    }

//    public void constructGraphicsGrid(){
//        int row=1+size*2;
//        int col=1+size*3;
//        boardGraphicalGrid =new char[row][col];
//        for (int i=0;i<row;i++)
//        {
//            for(int j=0;j<col;j++)
//            {
//                boardGraphicalGrid[i][j]=' ';
//            }
//        }
//        for(int r=0;r<row-1;r+=2) {
//            for (int i = 0; i < col-1; i += 3) {
//                boardGraphicalGrid[r][i] = '+';
//                boardGraphicalGrid[r+2][i] = '+';
//                boardGraphicalGrid[r][i+3] = '+';
//                boardGraphicalGrid[r+2][i+3] = '+';
//
//                boardGraphicalGrid[r+1][i] = '|';
//                boardGraphicalGrid[r+1][i+3] = '|';
//
//                boardGraphicalGrid[r][i+1] = '-';
//                boardGraphicalGrid[r][i+2] = '-';
//
//                boardGraphicalGrid[r+2][i+1] = '-';
//                boardGraphicalGrid[r+2][i+2] = '-';
//            }
//        }
//
//        indexDisplayboard=new char[row][col];
//
//        for (int i=0;i<row;i++)
//        {
//            for(int j=0;j<col;j++)
//            {
//                indexDisplayboard[i][j]=' ';
//            }
//        }
//        for(int r=0;r<row-1;r+=2) {
//            for (int i = 0; i < col-1; i += 3) {
//                indexDisplayboard[r][i] = '+';
//                indexDisplayboard[r+2][i] = '+';
//                indexDisplayboard[r][i+3] = '+';
//                indexDisplayboard[r+2][i+3] = '+';
//
//                indexDisplayboard[r+1][i] = '|';
//                indexDisplayboard[r+1][i+3] = '|';
//
//                indexDisplayboard[r][i+1] = '-';
//                indexDisplayboard[r][i+2] = '-';
//
//                indexDisplayboard[r+2][i+1] = '-';
//                indexDisplayboard[r+2][i+2] = '-';
//            }
//        }
//
//        for(int i=0;i<size;i++)
//            for(int j=0;j<size;j++)
//            {
//                int mapx=2*i+1;
//                int mapy=3*j+1;
//                int idx=boardLogicGrid[i][j].getDisplayIndex();
//                if(idx<=9)
//                    indexDisplayboard[mapx][mapy]=(char) (idx+'0');
//                else{
//
//                    indexDisplayboard[mapx][mapy]=(char) (idx/10+'0');
//                    indexDisplayboard[mapx][mapy+1]=(char) (idx%10+'0');
//                }
//            }
//    }
}
