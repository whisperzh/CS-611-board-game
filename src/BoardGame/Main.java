package BoardGame;

public class Main {
    public static void main(String[] args){

        System.out.println("Hi there, Welcome to boardgame");

        Room room=new Room();
        room.gameChoose();
        room.play();

        System.out.println("GoodBye");
    }
}
