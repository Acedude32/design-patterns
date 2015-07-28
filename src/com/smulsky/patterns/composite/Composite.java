package com.smulsky.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape {
    private List<Shape> shapes = new ArrayList<Shape>();

    @Override
    public void draw() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public void remove(Shape shape) {
        shapes.remove(shape);
    }
}
