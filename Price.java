public abstract class Price {
    public abstract int getPriceCode();

    // Refactoring 7 — Passo 4: getCharge
    public abstract double getCharge(int daysRented);
}
