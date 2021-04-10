package com.liumq.simplejava.extendsheadfirst;

public class InstanceInitTest {
    {
        a=6;
    }
    int a = 9;

    public static void main(String[] args) {
        System.out.println(new InstanceInitTest().a);
    }
}
