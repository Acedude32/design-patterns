package com.smulsky.patterns.decorator;

public class WindowWithTitle extends Decorator {
    public WindowWithTitle(Window window) {
        super(window);
    }

    @Override
    String getName() {
        return "I am WindowWithTitle";
    }

    @Override
    public void create() {
        window.create();
        System.out.println("Created Title");
    }
}
