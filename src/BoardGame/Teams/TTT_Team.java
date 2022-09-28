package BoardGame.Teams;

import BoardGame.Players.TTT_Player;

import java.util.LinkedList;
@SuppressWarnings("unchecked")
public class TTT_Team extends Team{
    public TTT_Team() {
        score=0;
        initPlayerQueue();
        addPlayer(new TTT_Player(this));
    }

    public TTT_Team(char t, String name) {
        score=0;
        initPlayerQueue();
        this.name=name;
        teamPieceType=t;
        addPlayer(new TTT_Player(this));
    }
    public void react(){
        getBoard().setCurrentTeam(this);
        TTT_Player p= (TTT_Player) playerQueue.poll();
        board.displayBoardIndex();
        System.out.println(name+":");
        System.out.println(p.getName()+"\'s turn:");
        int ip=p.input();
        while (!valid(ip)){
            ip=p.input();
        }
        p.move();
        playerQueue.add(p);
        board.printGrid();
    }
    public void initPlayerQueue(){
        playerQueue=new LinkedList<TTT_Player>();
    }
}
