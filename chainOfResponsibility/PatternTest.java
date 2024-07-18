package org.patterns.chainOfResponsibility;

public class PatternTest {

    public static void main(String args[]) {
    	System.out.println("Chain Of Responsibility Pattern Test: ");
        IProcess process1 = new ClsProcess1();
        IProcess process2 = new ClsProcess2();
        IProcess process3 = new ClsProcess3();
        IProcess process4 = new ClsProcess4();

        process1.setNextHandler(process2);
        process2.setNextHandler(process3);
        process3.setNextHandler(process4);

        process1.runProcess();



    }
}
