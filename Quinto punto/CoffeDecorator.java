package com.company;

public abstract class CoffeDecorator implements CoffeProduct{
    private CoffeProduct coffeProduct;

    public CoffeDecorator(CoffeProduct coffeProduct){
        setCoffeProduct(coffeProduct);
    }

    public void setCoffeProduct(CoffeProduct coffeProduct){
        this.coffeProduct = coffeProduct;
    }

    public CoffeProduct getCoffeProduct(){
        return coffeProduct;
    }
}
