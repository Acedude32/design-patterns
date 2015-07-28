package com.smulsky.patterns.adapter;

public class TempAdapter implements TemperatureInfo {

    private Temparature temparature = new Temparature();

    @Override
    public int getTempInK() {
        return temparature.getTemperature();
    }

    @Override
    public int getTempInC() {
        return temparature.getTemperature() + 122;
    }
}
