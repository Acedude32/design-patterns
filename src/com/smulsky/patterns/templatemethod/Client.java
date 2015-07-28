package com.smulsky.patterns.templatemethod;

public class Client {
    public static void main(String[] args) {

        Compiler compiler = new CompilerForC();
        compiler.compile();

        compiler = new CompilerForJava();
        compiler.compile();
    }
}
