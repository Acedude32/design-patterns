package com.smulsky.patterns.bridge;

public class Client {
    public static void main(String[] args) {
        Shape shape = new Circle(new CircleDrawerForWindows());
        shape.draw();
        shape = new Circle(new CircleDrawerForLinux());
        shape.draw();
    }
}
