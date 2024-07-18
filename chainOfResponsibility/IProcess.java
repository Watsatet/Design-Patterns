package org.patterns.chainOfResponsibility;

public abstract class IProcess {
    protected IProcess process;

    public void setNextHandler(IProcess process) {
        this.process = process;
    }

    public abstract void runProcess();
}
