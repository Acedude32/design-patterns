package com.smulsky.patterns.chainofresponsibility;

public class NameChecker extends Handler {

    @Override
    protected boolean handlerFits(Request request) {
        if(request.getUserName().equals("Anton")) {
            return true;
        }
        return false;
    }

    @Override
    public void handle() {
        System.out.println("NameChecker handled request!");
    }
}
