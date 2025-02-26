package Topping;
import Pizza.MenuItem;

public abstract class PizzaTopping implements MenuItem{
    public abstract String toString();

    public String toNiceString() {
        return "Toppings is: " + this.toString() + " $" + this.getPrice();

    }

    @Override
    public Double getPrice() {
        return 1.50;
    }
}

