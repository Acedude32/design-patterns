package com.smulsky.patterns.memento;

public class MyBean {

    private String state;

    public MyBean(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void load(Memento memento) {
        this.state = memento.getState();
    }

    public Memento createMemento(){
        return new Memento(state);
    }
}
