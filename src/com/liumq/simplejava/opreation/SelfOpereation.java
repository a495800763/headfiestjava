package com.liumq.simplejava.opreation;

public class SelfOpereation {

    public static void main(String[] args) {
        aplusplus();
        System.out.println("================");
        plusplusa();
    }

    private static void aplusplus() {
        int a = 5;

        int b = a++ + 6;
        System.out.println(a + "\n" + b);
    }

    private static void plusplusa()
    {
        int a = 5;
        int b = ++a + 6;
        System.out.println(a + "\n" + b);
    }
}
