package com.smulsky.patterns.factorymethod;

public class Client {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        Animal animal = factory.getAnimal(getAnimalType());
        animal.makeSound();
        animal.run();
    }

    private static String getAnimalType() {
        return "cat";
    }
}
