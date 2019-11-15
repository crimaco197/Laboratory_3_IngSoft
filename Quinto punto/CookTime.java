package com.company;

public class CookTime extends CoffeDecorator{
    public CookTime(CoffeProduct coffeProduct){
        super(coffeProduct);
    }

    public String getName(){
        return getCoffeProduct().getName() + " + cook time > 2 minutes";
    }
    public int getPrice(){
        return  getCoffeProduct().getPrice() + 1200;
    }
}
