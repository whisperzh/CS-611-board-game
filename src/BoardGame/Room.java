package BoardGame;

import BoardGame.Boards.OAC_Board;
import BoardGame.Boards.TTT_Board;
import BoardGame.Teams.OAC_Team;
import BoardGame.Teams.TTT_Team;
import BoardGame.Teams.Team;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
@SuppressWarnings("unchecked")
public class Room {

    private Team winnerTeam;
    private Queue<Team> teamQueue;
//    private int gameSize;
    private int rounds;
    private Scanner scanner;

    public Room() {
        teamQueue=new LinkedList<>();
//        gameSize=3;
        rounds=0;

    }

    public Scanner getScanner() {
        if(scanner==null)
            scanner=new Scanner(System.in);
        return scanner;
    }

    public void gameChoose(){
        System.out.println("Please choose your game.");
        System.out.println("Games");
        System.out.println("\t[1] Tic-tac-toe");
        System.out.println("\t[2] Order and Chaos");

        int GameMode=getScanner().nextInt();
        while(GameMode!=1&&GameMode!=-1&&GameMode!=2) {
            System.out.println("Your Input is Invalid, please input again.");
            GameMode = getScanner().nextInt();

        }
        System.out.println("Your Input: ["+Integer.toString(GameMode) +"]");
        if(GameMode==1)
        {
            Team.setBoard(new TTT_Board());
            teamQueue.clear();
            System.out.println("please choose the size of the game the minimal size of game is 3");
            int size=getScanner().nextInt();
            if(size<=3)
                Team.setBoard(new TTT_Board());
            else
                Team.setBoard(new TTT_Board(size));
            teamQueue.add(new TTT_Team('O',"Team O"));
            teamQueue.add(new TTT_Team('X',"Team X"));
//            gameSize=Team.board.getSize();
        }else if(GameMode==2)
        {
            Team.setBoard(new OAC_Board());
            teamQueue.clear();
            Team.setBoard(new OAC_Board());
            teamQueue.add(new OAC_Team("Order"));
            teamQueue.add(new OAC_Team("Chaos"));
//            gameSize=Team.board.getSize();
        }

    }

    public void play(){
        while(true)
        {
            Team t=teamQueue.poll();
            t.react();
            teamQueue.add(t);
            if(Judge())
            {
                checkOut();
                printScoreTable();
                //user input
                System.out.println("Do you want to play again?(y/n)");
                String result=getScanner().next();
                if(result.equalsIgnoreCase("y")||result.equalsIgnoreCase("yes"))
                {
                    System.out.println("Input: yes");
                    Team.getBoard().reset();
                }else
                {
                    System.out.println("Input: no");
                    break;
                }
            }
        }
        System.out.println("Thank you for playing!");
        int stm=rounds;
        for(var team: teamQueue) {
            System.out.println(team.getName() + " won " + team.getScore() + " times.");
            stm-=team.getScore();
        }
        System.out.println("There were " + stm + " stalemates.");

    }

    public boolean Judge(){
        if(Team.getBoard().boardGameWinnerJudgment())
        {
            System.out.println("Game Over");
            return true;
        }
        if(Team.getBoard().stalemateCheck())
        {
            System.out.println("Game Over");
            System.out.println("A Stalemate!");
            return true;
        }
        return false;
    }

    public void checkOut(){
        rounds++;
        if(Team.getBoard().stalemateCheck())
            return;
        for(var team: teamQueue)
        {
            team.doCheckOut();
            if(team.getStatus())
                winnerTeam=team;
        }
        System.out.println("winner is "+winnerTeam.getName());
    }

    public void printScoreTable(){
        System.out.println("Team name\tScore\tRound");
        for(Team t : teamQueue)
        {
            System.out.println(t.getName()+"\t"+t.getScore()+"\t"+rounds);
        }
    }

}
