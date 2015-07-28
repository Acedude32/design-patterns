package com.smulsky.patterns.abstractfactory;

public class WoodenToyFactory implements AbstractToyFactory{


    @Override
    public Bear getBear() {
        return new WoodenBear();
    }

    @Override
    public Cat getCat() {
        return new WoodenCat();
    }
}
