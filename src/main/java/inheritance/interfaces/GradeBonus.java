package inheritance.interfaces;

public abstract interface GradeBonus {
    final float GRADE_BONUS_PERCENT=0.3f;
    public abstract double calculateGradeBonus(int grade,int rate);
}
