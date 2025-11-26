public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);

    // Refactoring 7 — Passo 6: getFrequentRenterPoints
    public int getFrequentRenterPoints(int daysRented) {
        // Por padrão, sem bônus
        return 1;
    }
}
