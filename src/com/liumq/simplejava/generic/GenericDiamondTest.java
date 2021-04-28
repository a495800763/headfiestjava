package com.liumq.simplejava.generic;

class MyClass<E> {
    public <T> MyClass(T t) {
        System.out.println("T 参数的值为：" + t);
    }
}

public class GenericDiamondTest {
    public static void main(String[] args) {
        //MyClass 类声明中的E形参是String类型
        //泛型构造器中声明的T形参时Integer类型
        MyClass<String> mc1 = new MyClass<String>(5);
        //显式指定泛型构造器中声明的T 形参类型是Integer
        MyClass<String> mc2 = new <Integer>MyClass<String>(5);



        //myClass类声明中的E形参时String 类型
        //如果显式指定泛型构造器中的声明T 形参是Integer 类型
        //则此时不能使用 菱形语法，String 不能省略
        //MyClass<String> mc3 = new <Integer>MyClass<>(5);
    }
}
