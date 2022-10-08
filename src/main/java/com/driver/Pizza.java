package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            setPrice(300);
        }
        else{
            setPrice(400);
        }
        // your code goes here
    }

    public void setPrice(int price) {
        if(this.isVeg){
            this.price = this.price + price;
        }else{
            this.price = this.price + price;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        int price = 80;
        setPrice(price);
        price = 0;
    }

    public void addExtraToppings(){
        // your code goes here
        int price = 70;
        setPrice(price);
        price = 0;
    }

    public void addTakeaway(){
        // your code goes here
        int price = 20;
        setPrice(price);
        price = 0;
    }

    public String getBill(){
        // your code goes here
        setBill(String.valueOf(this.price)+"\n");
        return this.bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }
}
