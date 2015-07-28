package com.smulsky.patterns.abstractfactory;

public class Client {

    public static void main(String[] args) {
        AbstractToyFactory factory = FactoryProducer.getConcreteFactory(getToyTypeConfig());
        Bear bear = factory.getBear();
        System.out.println(bear.getName());
    }

    private static String getToyTypeConfig() {
        return "soft";
    }
}
