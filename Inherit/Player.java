package Inherit;

public abstract class Player {
    String playerName;
    Player(String name){
        this.playerName = name;
    }
    public abstract void displayDetail();
}
