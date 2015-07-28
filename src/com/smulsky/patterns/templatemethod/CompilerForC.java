package com.smulsky.patterns.templatemethod;

public class CompilerForC extends Compiler {
    @Override
    protected void collectScr() {
        System.out.println("Collect for C");
    }

    @Override
    protected void compileToTarget() {
        System.out.println("Compile to Target for C");
    }
}
