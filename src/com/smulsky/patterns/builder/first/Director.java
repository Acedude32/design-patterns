package com.smulsky.patterns.builder.first;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Car construct() {
        builder.createNewCar();
        builder.buildBody();
        builder.buildWheels();
        builder.paint();
        return  builder.getBuildedCar();
    }
}
