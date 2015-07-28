package com.smulsky.patterns.bridge;

public class CircleDrawerForWindows implements DrawingAPI {
    @Override
    public void drawShape() {
        System.out.println("Windows: Circle");
    }
}
