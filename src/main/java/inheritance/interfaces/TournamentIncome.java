package inheritance.interfaces;

public class TournamentIncome extends Player implements GradeBonus{
    private  int grade;
    private int rate;
    public TournamentIncome(String name,int grade,int rate){
        super(name);
        this.grade=grade;
        this.rate=rate;
    }
    public void displayDetail() {
        System.out.println(super.playerName+ " Bonus= "+ calculateGradeBonus(this.grade,this.rate));
    }

    public double calculateGradeBonus(int grade,int rate) {
        if(grade>=2&&rate>=2) return GRADE_BONUS_PERCENT*grade;
        else         return 0;
    }


}
