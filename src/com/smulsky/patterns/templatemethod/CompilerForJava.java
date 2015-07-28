package com.smulsky.patterns.templatemethod;

public class CompilerForJava extends Compiler {
    @Override
    protected void collectScr() {
        System.out.println("Collect src for java");
    }

    @Override
    protected void compileToTarget() {
        System.out.println("Compile to target for java ");
    }
}
