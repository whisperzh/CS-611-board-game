package BoardGame.Boards;

import BoardGame.Pieces.TTT_Piece;

public class TTT_Board extends Board {
    public TTT_Board(){
        super();
    }

    public TTT_Board(int boardSize) {
        super(boardSize);
    }

    @Override
    public void constructLogicGrid() {
        boardLogicGrid=new TTT_Piece[size][size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
                boardLogicGrid[i][j]=new TTT_Piece(i*size+j+1);
        }

    }

    public boolean boardGameWinnerJudgment()
    {
        if(currNumOfPieceinAllDir()>=size)
            return true;
        return false;
    }

}

