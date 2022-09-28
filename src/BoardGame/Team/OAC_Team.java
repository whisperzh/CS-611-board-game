package BoardGame.Team;
import BoardGame.Player.OAC_Player;


import java.util.LinkedList;

public class OAC_Team extends Team{

    public OAC_Team(String name) {
        score=0;
        this.name=name;
        initPlayerQueue();
        addPlayer(new OAC_Player(this));
    }

    public void react(){
        getBoard().setCurrentTeam(this);
        OAC_Player p= (OAC_Player) playerQueue.poll();
        board.displayBoardIndex();
        System.out.println(p.getName()+"\'s turn:");
        int ip=p.input();
        while (!valid(ip)){
            ip=p.input();
        }
        p.move();
        playerQueue.add(p);
        board.printGrid();
    }

    public void doCheckOut(){
        if(board.stalemateCheck()&&getName().equalsIgnoreCase("Chaos"))
            win();
        else if(board.stalemateCheck()==false&&getName().equalsIgnoreCase("Order"))
            win();
    }

    public void initPlayerQueue(){
        playerQueue=new LinkedList<OAC_Player>();
    }
}
