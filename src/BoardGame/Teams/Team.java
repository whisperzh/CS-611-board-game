package BoardGame.Teams;

import BoardGame.Boards.Board;
import BoardGame.Players.Player;

import java.util.LinkedList;
import java.util.Queue;
@SuppressWarnings("unchecked")
public class Team {
    protected Queue playerQueue;
    protected int score;
    public static Board board;
    protected String name;
    protected char teamPieceType;
    private boolean status;

    public Team() {
        score=0;
        initPlayerQueue();
        addPlayer(new Player(this));
    }

    public Team(char t,String name) {
        score=0;
        initPlayerQueue();
        this.name=name;
        teamPieceType=t;
        addPlayer(new Player(this));
    }
    public Team(String name)
    {
        score=0;
        initPlayerQueue();
        this.name=name;
        addPlayer(new Player(this));
    }

    public static void setBoard(Board board) {
        Team.board = board;
    }

    public int getScore() {
        return score;
    }

    public char getTeamPieceType() {
        return teamPieceType;
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
        if(board.getCurrPieceType()==teamPieceType)
            win();
    }

    public void win() {
        score++;
        status=true;
    }

    public boolean getStatus() {
        return status;
    }

    public boolean valid(int x){
        return board.validSet(x);
    }

    public void react(){
        Player p=(Player) playerQueue.poll();
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

    public void reset(){

    }

    public String getName() {
        return name;
    }

}
