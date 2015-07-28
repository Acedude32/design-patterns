package com.smulsky.patterns.abstractfactory;

public class FactoryProducer {

    public static AbstractToyFactory getConcreteFactory(String toyType) {

        if ("wooden".equals(toyType)) {
            return new WoodenToyFactory();
        } else if ("soft".equals(toyType)) {
            return new SoftToyFactory();
        }
        return null;

    }
}
