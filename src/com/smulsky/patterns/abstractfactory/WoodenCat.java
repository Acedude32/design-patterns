package com.smulsky.patterns.abstractfactory;

public class WoodenCat implements  Cat  {
    @Override
    public String getName() {
        return "Wooden cat";
    }

    @Override
    public String meow() {
        return "Wooden cat meow";
    }
}
