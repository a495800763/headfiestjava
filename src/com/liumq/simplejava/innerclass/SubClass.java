package com.liumq.simplejava.innerclass;

public class SubClass extends OuterClass.InnerClass {
    //显式定义SubClass的构造器
    public SubClass(OuterClass out) {

        //sub继承自 inner
        //inner必须是使用其外部类out来调用
        //即 父类的外部类的实例.父类的构造器(参数)
        out.super("hELLO");
    }
}
