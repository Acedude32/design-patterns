package com.smulsky.patterns.bridge;

public class CircleDrawerForLinux implements DrawingAPI {
    @Override
    public void drawShape() {
        System.out.println("Linux: Circle");
    }
}
