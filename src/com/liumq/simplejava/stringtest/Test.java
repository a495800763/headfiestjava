package com.liumq.simplejava.stringtest;

public class Test {
    public static void main(String[] args) {

        String a = "Hello";
        String b = "Hello";
        //a b 是同一个字符串对象的引用
        System.out.println(a==b);
        String c = new String("Hello");
        String d = new String("Hello");
        //c 与 d 是两个不同的对象的引用
        System.out.println(c==d);
        //但是c与d 的字符串的值完全相等
        System.out.println(c.equals(d));
    }
}
