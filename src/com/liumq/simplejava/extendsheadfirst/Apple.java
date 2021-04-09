package com.liumq.simplejava.extendsheadfirst;

public class Apple extends Fruit {
    public static void main(String[] args) {
        Apple a = new Apple();
        //Apple类的对象本身没有weight实例变量
        //Apple类的父类有weight实例变量，因此Apple类也可以访问weight变量
        a.weight = 56;
        //同理 Apple类也有info()方法
        a.info();
    }
}
