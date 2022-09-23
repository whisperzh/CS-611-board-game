package BoardGame.Room;

import BoardGame.Team.Team;

import java.util.Queue;

public class TTT_Room extends Room{
    public Team winnerTeam;
    public char currWinnerType;
    public Queue<Team> teamQueue;
    private int rounds;

    public TTT_Room() {
        rounds=0;
    }

    public void Play(){

    }

    public boolean Judge(){
        return false;
    }

    public void CheckOut(){
        rounds++;
        for(var team: teamQueue)
        {
            team.doCheckOut();
            if(team.getStatus())
                winnerTeam=team;
        }
    }

}
