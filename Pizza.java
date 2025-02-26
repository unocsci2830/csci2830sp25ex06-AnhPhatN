package Pizza;
import java.util.ArrayList;

import Crust.PizzaCrust;
import Sauce.PizzaSauce;
import Topping.PizzaTopping;

public class Pizza implements MenuItem {
    private PizzaCrust crust;
    private PizzaSauce sauce;
    private ArrayList<PizzaTopping> toppingList;
    private ArrayList<MenuItem> selectionList;

    public Pizza() {
        this.crust = null;
        this.sauce = null;
        this.toppingList = new ArrayList<PizzaTopping>();
        this.selectionList = new ArrayList<MenuItem>();

    }

    /* crust methods */
    public PizzaCrust getCrust() {
        return this.crust;
    }

    public void setCrust(PizzaCrust crust) {
        this.crust = crust;
        this.selectionList.add(crust);

    }

    /* sauce methods */
    public PizzaSauce getSauce() {
		return this.sauce;
	}

	public void setSauce(PizzaSauce sauce) {
		this.sauce = sauce;
        this.selectionList.add(sauce);
	}

    /* topping methods */
    public ArrayList<PizzaTopping> getTopping() {
		return this.toppingList;
	}

	public void setTopping(ArrayList<PizzaTopping> toppings) {
		this.toppingList = toppings;
	}

    public void addTopping(PizzaTopping topping) {
		this.toppingList.add(topping);
        this.selectionList.add(topping);
	}

    public void display() {
		System.out.println("\nPrinting out pizza: ");
		System.out.println(this.crust.toNiceString());
		System.out.println(this.sauce.toNiceString());
        System.out.println("Toppings: ");
		for (PizzaTopping topping : this.toppingList) {
			System.out.println(topping.toNiceString());
		}

		System.out.println("\nTotal Price: $" + this.getPrice());

	}

/*     @Override
    public Double getPrice() {
        Double totalPrice = 0.0;
        totalPrice += this.crust.getPrice();
        totalPrice += this.sauce.getPrice();
        for (PizzaTopping t : this.toppingList) {
            totalPrice += t.getPrice();
        }
        return totalPrice;
    } */



    @Override
    public Double getPrice() {
        Double totalPrice = 0.0;
        for (MenuItem m : this.selectionList) {
            totalPrice += m.getPrice();
        }
        return totalPrice;

    }



}


