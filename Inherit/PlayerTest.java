package Inherit;

public class PlayerTest {
    public static void main(String[] args) {
        PlayerIncome p1 = new PlayerIncome("Player A", 5000000);
        TournamentIncome p2 = new TournamentIncome("Player B", 2,2);
        p1.displayDetail();
        p2.displayDetail();
    }
}
