package com.liumq.simplejava.oopprehead;

public class EqualTest {
    public static void main(String[] args) {
        int it = 65;
        float fl = 65.0f;
        System.out.println("65和65.0f是否相等:" + (it == fl));
        char ch = 'A';
        System.out.println("65和'A'是否相等:" + (it == ch));

        String st1 = new String("hello");
        String st2 = new String("hello");
        System.out.println("st1和st2是否==：" + (st1 == st2));

        System.out.println("st1和st2是否equals："+(st1.equals(st2)));
    }
}
