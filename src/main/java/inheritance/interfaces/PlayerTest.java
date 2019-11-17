package inheritance.interfaces;

public class PlayerTest {
    public static void main(String[] args){
        PlayerIncome p1= new PlayerIncome("Player A",12441.324);
        TournamentIncome p2=new TournamentIncome("Player B", 3,2);
        p1.displayDetail();
        p2.displayDetail();
    }
}
