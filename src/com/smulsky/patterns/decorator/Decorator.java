package com.smulsky.patterns.decorator;

public abstract class Decorator implements Window{
    protected Window window;

    Decorator(Window window){
        this.window = window;
    }

    abstract String getName();

}
