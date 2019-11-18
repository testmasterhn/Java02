package Inherit;

public class PlayerIncome extends Player implements Tax{
    private int income;
    PlayerIncome(String playerName, int income){
        super(playerName);
        this.income = income;

    }
    public void displayDetail() {
        System.out.println(super.playerName + ", income = " + this.income + " tax = " + calculateTax(this.income));
    }

    public double calculateTax(int income) {
        return TAX_PERCENT * income;
    }
}
