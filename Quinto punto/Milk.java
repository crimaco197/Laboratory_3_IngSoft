package com.company;

public class Milk extends CoffeDecorator{
    public Milk(CoffeProduct coffeProduct){
        super(coffeProduct);
    }

    public String getName(){
        return getCoffeProduct().getName() + " + Milk";
    }
    public int getPrice(){
        return  getCoffeProduct().getPrice() + 1000;
    }
}
