package com.liumq.simplejava.myinterface;

interface InterfaceA {
    int PROP_A = 5;

    void testA();
}

interface InterfaceB {
    int PROP_B = 6;

    void testB();
}

//接口继承自ABC 三个父接口
interface InterfaceC extends  InterfaceB,InterfaceA {
    int PROP_C = 7;

    void testC();
}


public interface InterfaceExtendsTest  {
    public static void main(String[] args) {
        System.out.println(InterfaceC.PROP_A);
        System.out.println(InterfaceC.PROP_B);
        System.out.println(InterfaceC.PROP_C);
    }
}
