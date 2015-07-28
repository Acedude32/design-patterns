package com.smulsky.patterns.chainofresponsibility;

public class Client {

    public static void main(String[] args) {
        Request request = new Request();
        request.setRequestType("http");
        request.setUserName("Anton");

        Handler nameChecker = new NameChecker();
        Handler typeChecker = new RequestTypeChecker();

        nameChecker.setNext(typeChecker);
        nameChecker.handleRequest(request);
    }
}
