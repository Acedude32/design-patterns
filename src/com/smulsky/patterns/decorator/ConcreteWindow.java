package com.smulsky.patterns.decorator;

public class ConcreteWindow implements Window {
    @Override
    public void create() {
        System.out.println("Created Window");
    }
}
