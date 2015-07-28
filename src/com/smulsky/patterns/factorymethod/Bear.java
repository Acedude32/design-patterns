package com.smulsky.patterns.factorymethod;

public class Bear implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Agggrgrr");
    }

    @Override
    public void run() {
        System.out.println("Bear runs");
    }
}
