package com.driver;

public class DeluxePizza extends Pizza {
    Boolean flag = true;

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
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

    public void addTakeaway(){
        // your code goes here
        if(flag){
            flag = false;
            super.addTakeaway();
        }
    }
}
