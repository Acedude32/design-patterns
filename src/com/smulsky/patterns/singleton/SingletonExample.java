package com.smulsky.patterns.singleton;


public class SingletonExample {
    private static SingletonExample instance;

    private SingletonExample(){}

    public static synchronized SingletonExample getInstance(){
        if (instance == null){
            instance = new SingletonExample();
        }
        return instance;
    }

    public String info(){
        return "I am singleton" + this.toString();
    }

}


class SingletonExample2 {
    private static SingletonExample2 instance = new SingletonExample2() ;

    public static SingletonExample2 getInstance(){
        return instance;
    }

    private SingletonExample2(){}

    public String info(){
        return "I am singleton" + this.toString();
    }

}

