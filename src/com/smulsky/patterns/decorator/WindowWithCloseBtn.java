package com.smulsky.patterns.decorator;

public class WindowWithCloseBtn extends Decorator {
    public WindowWithCloseBtn(Window window) {
        super(window);
    }

    @Override
    String getName() {
        return "I am WindowWithCloseBtn";
    }

    @Override
    public void create() {
        window.create();
        System.out.println("Created Close Button");
    }
}
