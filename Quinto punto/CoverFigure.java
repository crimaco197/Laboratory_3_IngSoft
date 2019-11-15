package com.company;

public class CoverFigure extends CoffeDecorator {
    public CoverFigure(CoffeProduct coffeProduct){
        super(coffeProduct);
    }

    public String getName(){
        return getCoffeProduct().getName() + " + figure in the cover";
    }
    public int getPrice(){
        return  getCoffeProduct().getPrice() + 500;
    }
}
