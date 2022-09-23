package BoardGame.Player;

import BoardGame.Team.Team;

import java.util.Scanner;

public class Player {
    protected String name;
    private int inputBuffer;
    private int winTimes;
    private Team team;

    private Scanner scanner;

    public Player(Team team){
        name=new String("Player");
        this.team=team;
        initScanner();
    }
    public Player(String name)
    {
        this.name=name;
    }

    public void Input(int x,int y){}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int input()
    {
        inputBuffer=scanner.nextInt();
        return inputBuffer;
    }

    public void move(){
        Team.getBoard().setGrid(inputBuffer,team.getTeamPieceType());
    }

    public void initScanner(){
        if(scanner==null)
            scanner=new Scanner(System.in);
    }

    public Scanner GetScanner(){
        return scanner;
    }

    public int getWinTimes() {
        return winTimes;
    }

    public void setWinTimes(int winTimes) {
        this.winTimes = winTimes;
    }

    public void WinTimeIncrement(){winTimes++;}
}
