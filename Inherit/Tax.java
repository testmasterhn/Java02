package Inherit;

public interface Tax {
    final double TAX_PERCENT = 0.02;
    abstract double calculateTax(int income);
}
