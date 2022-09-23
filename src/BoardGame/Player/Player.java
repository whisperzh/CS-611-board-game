package BoardGame.Player;

import java.util.Scanner;

public abstract class Player {
    protected String name;

    private int winTimes;

    private Scanner scanner;

    public Player(){
        name=new String("Player");
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

    public abstract void Input(Integer x, Integer y);

    public void InitScanner(){
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
