package com.liumq.simplejava.extendsheadfirst;

class Parent {
    public String tag = "疯狂java讲义";
}

public class Deried extends Parent {
    private String tag = "轻量级javaEE 企业应用实践";
}

class Test {
    public static void main(String[] args) {
        Deried d = new Deried();
        //直接访问d的tag编译错误，因为是private
        //System.out.println(d.tag);
        //显式的转为parent类型后可以访问了，但是访问的是parent类的tag变量
        System.out.println(((Parent) d).tag);
    }
}
