package BoardGame.Players;

import BoardGame.Teams.Team;

import java.util.Scanner;

public class Player {
    protected String name;
    protected int inputPositionBuffer;
    protected Team team;
    protected Scanner scanner;

    public Player(Team team){
        name=new String("Player");
        this.team=team;
        initScanner();
    }

    public Player(String name)
    {
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int input()
    {
//        System.out.println("please choose a grid");
//        inputPositionBuffer =scanner.nextInt();
//        Team.getBoard().setInputBuffer(inputPositionBuffer);
        return inputPositionBuffer;
    }

    public void move(){
//        Team.getBoard().setGrid(inputBuffer,team.getTeamPieceType());
    }

    public int getInputPositionBuffer() {
        return inputPositionBuffer;
    }

    public void initScanner(){
        if(scanner==null)
            scanner=new Scanner(System.in);
    }

}
