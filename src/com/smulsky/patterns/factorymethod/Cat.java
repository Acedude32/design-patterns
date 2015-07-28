package com.smulsky.patterns.factorymethod;

public class Cat implements Animal{
    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    @Override
    public void run() {
        System.out.println("Cat runs");
    }
}
