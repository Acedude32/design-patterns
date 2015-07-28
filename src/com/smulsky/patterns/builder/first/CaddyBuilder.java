package com.smulsky.patterns.builder.first;

public class CaddyBuilder extends Builder {
    @Override
    public void createNewCar() {
        car = new Caddy();
    }

    @Override
    public void buildBody() {
        car.setBodySize(1);
    }

    @Override
    public void buildWheels() {
        car.setWheelSize(1);
    }

    @Override
    public void paint() {
        car.setColor("grey");
    }
}
