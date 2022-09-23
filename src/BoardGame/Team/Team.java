package BoardGame.Team;

import BoardGame.Boards.Board;
import BoardGame.Player.Player;

import java.util.LinkedList;
import java.util.Queue;

public class Team {
    private Queue<Player> playerQueue;
    private int score;

    public static void setBoard(Board board) {
        Team.board = board;
    }

    static Board board;
    private String name;
    private char teamPieceType;
    private boolean status;

    public char getTeamPieceType() {
        return teamPieceType;
    }
    public Team() {
        score=0;
        initPlayerQueue();
        addPlayer(new Player(this));
    }

    public Team(char t) {
        score=0;
        initPlayerQueue();
        teamPieceType=t;
        addPlayer(new Player(this));
    }
    public void initPlayerQueue(){
        playerQueue=new LinkedList();
    }

    public void addPlayer(Player p){
        playerQueue.add(p);
    }

    public static Board getBoard() {
        return board;
    }

    public void doCheckOut(){
        if(board.getCurrType()==teamPieceType)
            win();
    }

    private void win() {
        status=true;
    }

    public boolean getStatus() {
        return status;
    }

    public boolean valid(int x){
        return board.validSet(x);
    }

    public void react(){
        Player p=playerQueue.poll();
        int ip=p.input();
        while (!valid(ip))
            ip=p.input();
        p.move();
        playerQueue.add(p);
        board.printGrid();
    }

    public void reset(){

    }

}
