package com.driver;

public class Pizza {

private int price;//final price
    private int vegBasePrice = 300;
    private int nonVegBasePrice = 400;
    private int basePrice;
    private boolean isVeg;
    private String bill;
    private boolean isCheeseAdded;
    private int cheesePrice = 80;
    private boolean isToppingAdded;
    private int vegToppingPrice = 70;
    private int nonVegToppingPrice = 120;
    private int toppingPrice;
    private boolean isTakeAway;
    private int takeAwayPrice = 20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        basePrice = getBasePrice();
        price = basePrice;
        isCheeseAdded = false;
        isToppingAdded = false;
        isTakeAway = false;

    }

    public int getPrice(){
        return this.price;
    }

    private int getBasePrice(){
        basePrice = isVeg ? vegBasePrice : nonVegBasePrice;
        return basePrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            isCheeseAdded = true;
            price += cheesePrice;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingAdded){
            this.isToppingAdded = true;
            if(isVeg) {
                toppingPrice += vegToppingPrice;
            }else{
                toppingPrice += nonVegToppingPrice;
            }
            price += toppingPrice;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            isTakeAway = true;
            price += takeAwayPrice;
        }
    }

    public String getBill(){
        // your code goes here
        String var = "";
        var += "Base Price Of The Pizza: " + basePrice + "\n";
        if(isCheeseAdded){
            var += "Extra Cheese Added: " + cheesePrice + "\n";
        }
        if(isToppingAdded){
            var += "Extra Toppings Added: " + toppingPrice + "\n";
        }
        if(isTakeAway){
            var += "Paperbag Added: " + takeAwayPrice + "\n";
        }
        var += "Total Price: " + price + "\n";
        this.bill = var;
        return this.bill;
    }
}