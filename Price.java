public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);

    // Versão genérica de frequent renter points
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
