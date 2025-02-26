package Crust;
public class ThickCrust extends PizzaCrust {
    private Boolean isDeepDish;

    public void setIsDeepDish(Boolean bool) {
        this.isDeepDish = bool;
    }

    public String getIsDeepDish() {
        return this.isDeepDish.toString();
    }


    
    /* string methods */
    public String toString() {
        return "Thick Crust";
    }

    public String toNiceString() {
        return "Deep-Dish pizza crust: " + this.toString() + " (" + this.getCrustIngredient() + ") $" + this.getPrice();
    }



}   
