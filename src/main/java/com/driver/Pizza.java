package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill = "";

    private boolean takeaway = false;
    private boolean toppings = false;
    private boolean cheese = false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            setPrice(300);
            setBill("Base Price Of The Pizza: "+300+"\n");
        }
        else{
            setPrice(400);
            setBill("Base Price Of The Pizza: "+400+"\n");
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
            setBill("Extra Cheese Added: "+80+"\n");
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
                setBill("Extra Toppings Added: "+70+"\n");
                setPrice(Veggprice);
            }
            else{
                setBill("Extra Toppings Added: "+120+"\n");
                setPrice(nonVegg);
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeaway){
            setBill("Paperbag Added: "+20+"\n");
            this.takeaway = true;
            int price = 20;
            setPrice(price);
        }
    }

    public String getBill(){
        // your code goes here
        setBill("Total Price: "+String.valueOf(this.price)+"\n");
        return this.bill;
    }

    public void setBill(String bill) {
        this.bill = this.bill + bill;
    }
}
