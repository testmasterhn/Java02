package Inherit;

public class TournamentIncome extends Player implements GradeBonus {
    private int grade;
    private int rate;
    TournamentIncome(String playerName, int grade, int rate){
        super(playerName);
        this.grade = grade;
        this.rate = rate;
    }
    public double calculateGradeBonus() {
        if (grade >= 2 && rate >= 2){
            return GRADE_BONUS_PERCENT * grade;
        }
        return 0;
    }

    public void displayDetail() {
        System.out.println(super.playerName + ", Bonus = " + calculateGradeBonus());
    }
}
