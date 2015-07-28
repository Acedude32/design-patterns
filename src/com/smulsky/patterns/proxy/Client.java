package com.smulsky.patterns.proxy;

public class Client {
    public static void main(String[] args) {
        Server proxy = new Proxy();
        try {
            proxy.getConnection();
        } catch (AccessDeniedException e) {
            System.out.println("You have no rights");
        }
        proxy.closeConnection();

    }
}
