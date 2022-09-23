package BoardGame.Boards;

import BoardGame.Pieces.TTT_Piece;

public class TTT_Board extends Board {
    public TTT_Board(){
        super();
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


}

