package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean takeaway = false;
    private boolean toppings = false;
    private boolean cheese = false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            setPrice(300);
        }
        else{
            setPrice(400);
        }
    }

    public void setPrice(int price) {
        this.price = this.price + price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheese){
            this.cheese = true;
            int price = 80;
            setPrice(price);
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppings){
            this.toppings = true;
            int Veggprice = 70;
            int nonVegg = 120;
            if(this.isVeg){
                setPrice(Veggprice);
            }
            else{
                setPrice(nonVegg);
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeaway){
            this.takeaway = true;
            int price = 20;
            setPrice(price);
        }
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
