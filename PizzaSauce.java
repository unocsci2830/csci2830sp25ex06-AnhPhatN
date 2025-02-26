package Sauce;
import Pizza.MenuItem;

public abstract class PizzaSauce implements MenuItem{
    public abstract String toString();

    public String toNiceString() {
        return "Pizza sauce: " + this.toString() + " $" + this.getPrice();
    }

    @Override
    public Double getPrice() {
        return 0.50;
    }
}
