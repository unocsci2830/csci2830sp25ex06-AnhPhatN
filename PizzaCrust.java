package Crust;
import Pizza.MenuItem;

public abstract class PizzaCrust implements MenuItem{
    private String PizzaCrustIngredient;


    public abstract String toString();

    public String toNiceString() {
        return "Pizza crust: " + this.toString() + " (" + PizzaCrustIngredient + ") $" + this.getPrice();
    }
    

    public void setCrustIngredient(String ingredient) {
        this.PizzaCrustIngredient = ingredient;
    }

    public String getCrustIngredient() {
        return this.PizzaCrustIngredient;
    }


    public String checkIntegrity() {
		if (this.toString() == "Thick Crust") { /* making sure crust == Thick crust before checking if is deep dish */
			if (((ThickCrust) this).getIsDeepDish() == "true") {
				return " WARNING: will make deep-dish hard to handle";
			}
		}
		return "";
		
	}

    @Override
    public Double getPrice() {
        return 3.00;
    }

}
