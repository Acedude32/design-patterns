package com.smulsky.patterns.chainofresponsibility;

public abstract class Handler {

    public void setNext(Handler next) {
        this.next = next;
    }

    protected Handler next;

    public final void handleRequest(Request request) {
        if (handlerFits(request)) {
            handle();
        }
        if (next != null) {
            next.handleRequest(request);
        }
    }


    protected abstract boolean handlerFits(Request request);

    public abstract void handle();
}
