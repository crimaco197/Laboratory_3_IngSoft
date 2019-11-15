package com.company;

public class Mocha extends CoffeDecorator{
    public Mocha(CoffeProduct coffeProduct){
        super(coffeProduct);
    }

    public String getName(){
        return getCoffeProduct().getName() + " + Mocha";
    }
    public int getPrice(){
        return  getCoffeProduct().getPrice() + 2000;
    }
}
