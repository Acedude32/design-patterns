package com.smulsky.patterns.builder.first;

public abstract class Builder {
    protected Car car;
    public abstract void createNewCar();
    public abstract void buildBody();
    public abstract void buildWheels();
    public abstract void paint();
    public Car getBuildedCar(){
        return car;
    }
}
