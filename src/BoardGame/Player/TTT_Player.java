package BoardGame.Player;

import BoardGame.Team.TTT_Team;
import BoardGame.Team.Team;

public class TTT_Player extends Player{

    public TTT_Player(Team team) {
        super(team);
    }
    public void move(){
        Team.getBoard().setGrid(inputPositionBuffer,team.getTeamPieceType());
    }
    public int input()
    {
        System.out.println("please choose a grid");
        inputPositionBuffer =scanner.nextInt();
        TTT_Team.getBoard().setInputBuffer(inputPositionBuffer);
        return inputPositionBuffer;
    }

}
