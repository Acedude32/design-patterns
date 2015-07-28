package com.smulsky.patterns.builder.first;

public class XtrailBuilder extends Builder {
    @Override
    public void createNewCar() {
        car = new Xtrail();
    }

    @Override
    public void buildBody() {
        car.setBodySize(5);
    }

    @Override
    public void buildWheels() {
        car.setWheelSize(4);

    }

    @Override
    public void paint() {
        car.setColor("red");
    }
}
