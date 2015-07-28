package com.smulsky.patterns.builder.first;

public class Caddy extends Car {
    @Override
    public void go() {
        System.out.println(getColor());
        System.out.println(getBodySize());
        System.out.println(getWheelSize());
        System.out.println("Caddy going!");
    }
}
