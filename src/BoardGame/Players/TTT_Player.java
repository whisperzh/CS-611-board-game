package BoardGame.Players;

import BoardGame.Teams.TTT_Team;
import BoardGame.Teams.Team;

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
        System.out.println("Your Input:"+inputPositionBuffer);
        TTT_Team.getBoard().setInputBuffer(inputPositionBuffer);
        return inputPositionBuffer;
    }

}
