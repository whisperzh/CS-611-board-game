package BoardGame.Player;

public abstract class Player {
    protected String name;
    public Player(){
        name=new String("Player");
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

    public abstract boolean ValidMove(int x,int y);
}
