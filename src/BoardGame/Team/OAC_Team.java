package BoardGame.Team;

import BoardGame.Player.OAC_Player;
import BoardGame.Player.TTT_Player;

public class OAC_Team extends Team{

    public OAC_Team(String name) {
        super(name);
    }

    public void react(){
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
}
