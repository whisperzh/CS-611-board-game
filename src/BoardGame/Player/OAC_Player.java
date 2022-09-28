package BoardGame.Player;

import BoardGame.Team.OAC_Team;
import BoardGame.Team.Team;

public class OAC_Player extends Player{
    private char inputTypeBuffer;
    public OAC_Player(Team team) {
        super(team);
    }

    public int input()
    {
        System.out.println("please choose a grid");
        inputPositionBuffer =scanner.nextInt();
        System.out.println("please choose a piece type (O/X)");
        char ch=scanner.next().charAt(0);
        if(!Character.isUpperCase(ch))
            ch=Character.toUpperCase(ch);
        inputTypeBuffer = ch;
        OAC_Team.getBoard().setInputBuffer(inputPositionBuffer,inputTypeBuffer);
        return inputPositionBuffer;
    }

    public void move(){
        Team.getBoard().setGrid(inputPositionBuffer,inputTypeBuffer);
    }
}
