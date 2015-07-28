package com.smulsky.patterns.adapter;

public class Client {
    public static void main(String[] args) {
        TempAdapter adapter = new TempAdapter();
        System.out.println(adapter.getTempInC());
        System.out.println(adapter.getTempInK());
    }
}
