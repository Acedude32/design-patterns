package com.smulsky.patterns.builder.first;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new CaddyBuilder();
        director.setBuilder(builder);
        Car car = director.construct();
        car.go();
    }
}
