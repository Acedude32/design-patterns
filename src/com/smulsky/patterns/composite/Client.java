package com.smulsky.patterns.composite;

public class Client {
    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape square = new Square();
        Composite composite = new Composite();
        composite.add(circle);
        composite.add(square);

        Shape circle1 = new Circle();
        Shape square1 = new Square();
        Shape circle2 = new Circle();

        Composite mainComposite = new Composite();
        mainComposite.add(composite);
        mainComposite.add(circle1);
        mainComposite.add(square1);
        mainComposite.add(circle2);
        mainComposite.draw();
    }
}
