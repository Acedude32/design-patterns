package com.smulsky.patterns.memento;

public class MementoClient {
    public static void main(String[] args) {
        MyBean myBean = new MyBean("Old State");
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(myBean.createMemento());

        myBean.setState("New State");

        System.out.println(myBean.getState());

        myBean.load(careTaker.getMemento());

        System.out.println(myBean.getState());
    }
}
