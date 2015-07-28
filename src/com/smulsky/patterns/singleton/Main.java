package com.smulsky.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonExample singletonExample = SingletonExample.getInstance();
        SingletonExample singletonExample2 = SingletonExample.getInstance();

        System.out.println(singletonExample.info());
        System.out.println(singletonExample2.info());
    }
}
