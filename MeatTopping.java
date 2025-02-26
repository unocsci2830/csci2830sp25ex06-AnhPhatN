package Topping;
import Pizza.MenuItem;


public class MeatTopping extends PizzaTopping {
    private Integer spiciness;

    public MeatTopping() {
        this.spiciness = 0;
    }

    public Integer getSpiciness() {
        return this.spiciness;
    }

    public void setSpiciness(Integer spiciness) {
        this.spiciness = spiciness;
    }



    public String toString() {
        return "Meat Topping";
    }

    // @Override
    // public String toNiceString() {
    //     return super.toNiceString() +  " Spiciness: " + getSpiciness();
    // }

}

