package com.smulsky.patterns.abstractfactory;

public class SoftToyFactory implements AbstractToyFactory {
    @Override
    public Bear getBear() {
        return new SoftBear();
    }

    @Override
    public Cat getCat() {
        return new SoftCat();
    }
}
