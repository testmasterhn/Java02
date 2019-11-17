package inheritance.interfaces;

public class PlayerIncome extends Player implements Tax {
    double incomePlayer;
    public PlayerIncome(String name,double income){
        super(name);
        this.incomePlayer=income;
    }
    public void displayDetail() {
        System.out.println( super.playerName+ " income "+ this.incomePlayer + "Tax = "+ calculateTax(this.incomePlayer));
    }

    public double calculateTax(double income) {
        return TAX_PERCENT*income;
    }
}
