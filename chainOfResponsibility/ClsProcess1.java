package org.patterns.chainOfResponsibility;

public class ClsProcess1 extends IProcess {
    @Override
    public void runProcess() {
        System.out.println("Running Process1...");

        if (process != null) {
            process.runProcess();
        }


    }
}
