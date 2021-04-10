package com.liumq.simplejava.extendsheadfirst;

public class InstanceofTest {
    public static void main(String[] args) {
        //声明hello时使用Object 类型，则其变异类型是Object
        //Object 是所有类型的父类，但是hello变量的实际类型时String
        Object hello = "Hello";
        System.out.println("字符串是否是Object 类型的变量：" + (hello instanceof Object));
        System.out.println("字符串是否是String 类型的变量：" + (hello instanceof String));
        System.out.println("字符串是否是Math 类型的变量：" + (hello instanceof Math));
        System.out.println("字符串是否实现了Comparable接口：" + hello instanceof Comparable);
        String a = "Hello";
        //System.out.println("字符串是否实现了Comparable接口：" + (a instanceof Math));

    }
}
