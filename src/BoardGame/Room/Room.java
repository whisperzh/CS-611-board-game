package BoardGame.Room;

import BoardGame.Boards.Board;
import BoardGame.Team.Team;

import java.util.LinkedList;
import java.util.Queue;

public class Room {

    private Team winnerTeam;
    private char currWinnerType;
    private Queue<Team> teamQueue;
    private int gameSize;
    private int rounds;

    public Room() {
        teamQueue=new LinkedList<>();
        teamQueue.add(new Team('O'));
        teamQueue.add(new Team('X'));
        gameSize=3;
        rounds=0;
        Team.setBoard(new Board());
    }

    public void play(){
        while(true)
        {
            Team t=teamQueue.poll();
            t.react();
            teamQueue.add(t);
            if(Judge())
            {
                checkOut();
                break;
            }
        }
    }

    public boolean Judge(){
        if(Team.getBoard().currNumOfPieceinAllDir()>gameSize)
        {
            return true;
        }
        return false;
    }

    public void checkOut(){
        rounds++;
        for(var team: teamQueue)
        {
            if(team.getStatus())
                winnerTeam=team;
        }
    }

}
