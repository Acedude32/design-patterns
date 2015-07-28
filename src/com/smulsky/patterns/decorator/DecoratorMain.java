package com.smulsky.patterns.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Decorator decorator = new WindowWithTitle(new WindowWithCloseBtn(new ConcreteWindow()));
        decorator.create();
    }
}
