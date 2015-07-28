package com.smulsky.patterns.templatemethod;

public abstract class Compiler {

    protected abstract void collectScr();

    protected abstract void compileToTarget();

    public final void compile() {
        collectScr();
        compileToTarget();
    }
}
