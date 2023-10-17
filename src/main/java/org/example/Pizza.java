package org.example;

public class Pizza {
    private int price;
    private Boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPackPrice = 20;

    private int basePizzaPrice=0;

    private Boolean isExtraCheeseAdded = false;

    private Boolean isExtraToppingsAdded = false;

    private Boolean isTakeAwayOpted = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
//        System.out.println("Extra cheese added");
        this.price += extraCheesePrice;
    }

    public void addExtraToppings(){
        isExtraToppingsAdded = true;
//        System.out.println("Extra Toppings Added");;
        this.price += extraToppingsPrice;
    }

    public void takeAway(){
        isTakeAwayOpted = true;
//        System.out.println("Take away opted");
        this.price += backPackPrice;
    }

    public void getBill(){
//        String bill = "";
        System.out.println("Pizza: " + basePizzaPrice);
        int totalAmount =0;
        totalAmount+=basePizzaPrice;

        if(isExtraCheeseAdded){
//            bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
            totalAmount += extraCheesePrice;
            System.out.println("Extra Cheese Added: " + extraCheesePrice);
        }

        if(isExtraToppingsAdded){
//            bill += "Extra Toppings Added: " + extraToppingsAdded + "\n";
            totalAmount += extraToppingsPrice;
            System.out.println("Extra Toppings Added: " + extraToppingsPrice);
        }

        if(isTakeAwayOpted){
//            bill += "Take away: " + backPackPrice + "\n";
            totalAmount += backPackPrice;
            System.out.println("Take Away Opted: " + backPackPrice);
        }

//        bill += "Bill: " + this.price + "\n";
        System.out.println("Total Bill: " + totalAmount);
    }
}
