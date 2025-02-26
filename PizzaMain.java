package Pizza;

import java.util.Scanner;  // Import the Scanner class

import Crust.*;
import Sauce.*;
import Topping.*;



public class PizzaMain {
    private Pizza pizza;
    private Scanner input;
    

	public PizzaMain() {
		pizza = new Pizza();
		input = new Scanner(System.in);
	}


    private void inputCrustChoice() {
        Boolean validChoice = false;
        System.out.println("\nWhat kind of crust would you like:");
        System.out.println("1 - Thin crust");
        System.out.println("2 - Thick crust");
        System.out.print("Your choice: ");
        while (!validChoice) {
            Integer choice = input.nextInt();
            switch (choice) {
                case 1:
                    pizza.setCrust(new ThinCrust());
                    validChoice = true;
                    break;

                case 2:
                    pizza.setCrust(new ThickCrust());
                    validChoice = true;
					inputCrustIsDeepDish();
                    break;

                default:
                    System.out.println("Please pick between 1 or 2");
                    break;
            }
        }
    
    }

	private void inputCrustIsDeepDish() {
		Boolean validChoice = false;
        System.out.println("\nDo you want to make it a Deep-Dish pizza?");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        System.out.print("Your choice: ");
        while (!validChoice) {
            Integer choice = input.nextInt();
            switch (choice) {
				/* we type cast for these two cases because Deep-Dish is only avaible if pizza crust is thick */
                case 1:
					((ThickCrust) pizza.getCrust()).setIsDeepDish(true);
                    validChoice = true;
                    break;

                case 2:
					((ThickCrust) pizza.getCrust()).setIsDeepDish(false);
                    validChoice = true;
                    break;

                default:
                    System.out.println("Please pick between 1 or 2");
                    break;
            }
        }
	}





	private void inputCrustIngredient() {
		Boolean validChoice = false;
        System.out.println("\nWhat kind of crust ingredient would you like:");
        System.out.println("1 - flour");
        System.out.println("2 - cauliflower" + pizza.getCrust().checkIntegrity());
        System.out.print("Your choice: ");
        while (!validChoice) {
            Integer choice = input.nextInt();
            switch (choice) {
                case 1:
                    pizza.getCrust().setCrustIngredient("flour");
                    validChoice = true;
                    break;

                case 2:
					pizza.getCrust().setCrustIngredient("cauliflour");
                    validChoice = true;
                    break;

                default:
                    System.out.println("Please pick between 1 or 2");
                    break;
            }
        }
	}




	private void inputSauceChoice() {
		Boolean validChoice = false;
		System.out.println("\nWhat kind of sauce would you like:");
		System.out.println("1 - Marinara Sauce");
		System.out.println("2 - Pesto Sauce");
		System.out.print("Your choice: ");
		while (!validChoice) {
			Integer choice = input.nextInt();
			switch(choice) {
				case 1: 
					pizza.setSauce(new MarinaraSauce());
					validChoice = true;
					break;
				case 2: 
					pizza.setSauce(new PestoSauce());
					validChoice = true;
					break;
				default:
					System.out.println("Please pick between 1-2");
			}
		}
	}


    private void inputToppingChoices() {
		System.out.print("\nHow many toppings? ");
		Integer numToppings = input.nextInt();
		for (Integer i = 0; i < numToppings; i++) {
			Boolean validChoice = false;
            /* meat toppings */

			System.out.println("1 - Hamburger");
			System.out.println("2 - Sausage");
			System.out.println("3 - Pepperoni");
			System.out.println("4 - Chicken");

            /* veggie  toppings */
			System.out.println("5 - Mushroom");
			System.out.println("6 - Pineapple");
            System.out.println("7 - Bellpepper");
			System.out.println("8 - Olive");

            /* cheese toppings */
			System.out.println("9 - Mozzarella");
			System.out.println("10 - Provolone");
			System.out.println("11 - Jalapeno Jack");
			System.out.println("12 - Cheddar");
			System.out.print("Your choice (topping number " + (i + 1) + "): ");
			while (!validChoice) {
				Integer choice = input.nextInt();
				switch(choice) {
					case 1: 
						pizza.addTopping(new HamburgerTopping());
						validChoice = true;
						break;
					case 2: 
						pizza.addTopping(new SausageTopping());
						validChoice = true;
						break;
					case 3: 
						pizza.addTopping(new PepperoniTopping());
						validChoice = true;
						break;
					case 4: 
						pizza.addTopping(new ChickenTopping());
						validChoice = true;
						break;
					case 5: 
						pizza.addTopping(new MushroomTopping());
						validChoice = true;
						break;
					case 6: 
						pizza.addTopping(new PineappleTopping());
						validChoice = true;
						break;
                    case 7: 
						pizza.addTopping(new BellpepperTopping());
						validChoice = true;
						break;
					case 8: 
						pizza.addTopping(new OliveTopping());
						validChoice = true;
						break;
					case 9: 
						pizza.addTopping(new MozzarellaTopping());
						validChoice = true;
						break;
					case 10: 
						pizza.addTopping(new ProvoloneTopping());
						validChoice = true;
						break;
					case 11: 
						pizza.addTopping(new JalapenoJackTopping());
						validChoice = true;
						break;
					case 12: 
						pizza.addTopping(new OliveTopping());
						validChoice = true;
						break;
					default:
						System.out.println("Please pick between 1-12");
				}
			}
		}
	}



    private void showPizza() {
		pizza.display();
	}

    public void runMenu() {
        inputCrustChoice();
		inputCrustIngredient();
        inputSauceChoice();
        inputToppingChoices();
        showPizza();
    }


    public static void main(String[] args) {
        PizzaMain Pizza_obj = new PizzaMain(); /* since our functions are not static we need to create an object */
        Pizza_obj.runMenu();
    }



}