package com.liumq.simplejava.oopprehead;

public class FinalLocalVariableTest {
    public void test(final int a ){
        //不能对final修饰的形参赋值，下面语句非法
        //a=5;
    }

    public static void main(String[] args) {
        //定义final局部变量时指定默认值，则其无法重新赋值
        final String str = "hello";
        //下面的赋值语句非法
        //str="java";


        //定义final局部变量时没有赋值，可以赋值一次，然后不可更改
        final double d;
        d=3.456d;

        //d=2.34d;
    }

}
