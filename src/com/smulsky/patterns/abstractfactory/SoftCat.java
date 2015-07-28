package com.smulsky.patterns.abstractfactory;

public class SoftCat implements Cat {
    @Override
    public String getName() {
        return "Soft cat";
    }

    @Override
    public String meow() {
        return "Soft cat meow";
    }
}
