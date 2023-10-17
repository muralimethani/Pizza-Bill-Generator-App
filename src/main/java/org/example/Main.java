package org.example;

public class Main {
    public static void main(String[] args) {

        /* User have freedom to add
         extra cheese OR extra Toppings
         */
        Pizza basePizza = new Pizza(true);
        basePizza.addExtraCheese();
        basePizza.addExtraToppings();
        basePizza.takeAway();
        basePizza.getBill();

        // Deluxe Pizza Contains
        // Extra Cheese && Extra Toppings by default

        DeluxePizza d1 = new DeluxePizza(false);
        d1.addExtraCheese();
        d1.addExtraToppings();
        d1.takeAway();
        d1.getBill();
    }
}