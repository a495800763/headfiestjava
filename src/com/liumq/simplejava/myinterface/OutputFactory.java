package com.liumq.simplejava.myinterface;

public class OutputFactory {
    public Output getOutput() {
        return new BatterPrinter();
    }

    public static void main(String[] args) {
        OutputFactory of = new OutputFactory();
        Computer com = new Computer(of.getOutput());
        com.keyIn("轻量级javaee企业应用实践");
        com.keyIn("疯狂java讲义");
        com.print();
    }
}
