package com.liumq.simplejava.generic;

/**
 * 泛型构造器
 */
public class GenericConstructor {
    public static void main(String[] args) {
        //泛型构造器中的T类型为String
        new Foo("疯狂java讲义");
        //泛型构造器中的T 类型为Integer
        new Foo(200);
        //显式指定泛型构造器中的T 类型为String
        //且传递的参数也是String类型，满足类型条件
        new <String>Foo("疯狂Android讲义");
        //显式指定类型之后参数T 不能与指定的类型不符
        //new <String> Foo(2.34);
    }
}

class Foo {
    public <T> Foo(T t) {
        System.out.println(t);
    }
}
