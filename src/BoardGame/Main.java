package BoardGame;

import BoardGame.Games.BoardGame;
import BoardGame.Games.TTT_BoardGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Hi there, Welcome to boardgame");
        System.out.println("Games");
        System.out.println("\t[1] Tic-tac-toe");
        System.out.println("\t[2] Order and Chaos");
        Scanner sc=new Scanner(System.in);

        int GameMode=sc.nextInt();
        while(GameMode!=1&&GameMode!=-1&&GameMode!=2)
            GameMode=sc.nextInt();

        while (GameMode!=-1)
        {
            System.out.println("win!");
            GameMode=sc.nextInt();
        }
        System.out.println("GoodBye");
        return;
    }
}
