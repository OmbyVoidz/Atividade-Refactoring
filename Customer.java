import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector<Rental> _rentals = new Vector<>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    // Refactoring final: delega para TextStatement
    public String statement() {
        return new TextStatement().value(this);
    }

    // Refactoring final: delega para HtmlStatement
    public String htmlStatement() {
        return new HtmlStatement().value(this);
    }

    // Get enumerator de rentals
    public Enumeration<Rental> getRentals() {
        return _rentals.elements();
    }

    // Total de valores
    public double getTotalCharge() {
        double result = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    // Total de pontos de cliente frequente
    public int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
}
