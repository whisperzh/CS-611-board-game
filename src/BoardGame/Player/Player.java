package BoardGame.Player;

import BoardGame.Team.Team;

import java.util.Scanner;

public class Player {
    protected String name;

    public int getInputBuffer() {
        return inputBuffer;
    }

    private int inputBuffer;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int input()
    {
        System.out.println("please choose a grid");
        inputBuffer=scanner.nextInt();
        Team.getBoard().setInputBuffer(inputBuffer);
        return inputBuffer;
    }

    public void move(){
        Team.getBoard().setGrid(inputBuffer,team.getTeamPieceType());
    }

    public void initScanner(){
        if(scanner==null)
            scanner=new Scanner(System.in);
    }

}
