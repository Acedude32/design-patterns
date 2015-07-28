package com.smulsky.patterns.builder.second;

public class MainBuilder2 {
    public static void main(String[] args) {
        Airplane plane = new Airplane.Builder(Type.FIGHTER).color(Color.RED).crew(2).distance(1000).width(21).build();
        System.out.println(plane);
    }
}
