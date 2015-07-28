package com.smulsky.patterns.factorymethod;

public class AnimalFactory {

    public Animal getAnimal(String animalType) {
        Animal animal = null;
        if ("cat".equalsIgnoreCase(animalType)) {
            animal = new Cat();
        } else if ("bear".equalsIgnoreCase(animalType)) {
            animal = new Bear();
        }
        return animal;
    }
}
