package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        super.setPrice(150);
        // your code goes here
    }

    @Override
    public void addExtraCheese() {
//        super.addExtraCheese();
    }

    @Override
    public void addExtraToppings() {
//        super.addExtraToppings();
    }
}
