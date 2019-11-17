package inheritance.interfaces;

public abstract class Player {
    public String playerName;
    public Player(){};
    public Player(String name){
        this.playerName=name;
    }
    public abstract void displayDetail();
}
