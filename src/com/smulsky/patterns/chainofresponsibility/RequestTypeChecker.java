package com.smulsky.patterns.chainofresponsibility;

public class RequestTypeChecker extends Handler {
    @Override
    protected boolean handlerFits(Request request) {
        if ("http".equals(request.getRequestType())) {
            return true;
        }
        return false;
    }

    @Override
    public void handle() {
        System.out.println("Request handled by RequestTypeChecker!");
    }
}
