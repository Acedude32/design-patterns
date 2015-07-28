package com.smulsky.patterns.proxy;

public class ServerImpl implements Server {
    @Override
    public void getConnection() {
        System.out.println("ServerImpl: open connection");
    }

    @Override
    public void closeConnection() {
        System.out.println("ServerImpl close connection");
    }
}
