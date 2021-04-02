package com.liumq.simplejava.opreation;

/**
 * 拓展后的赋值运算符
 */
public class EnhanceAssignTest {
    public static void main(String[] args) {
        //定义一个byte 类型的变量
        byte a = 5;
        //a=a+5;
        byte b = 5;
        //可以使用a+=5 的情况不一定能使用 a=a+5
        b += 5;

        System.out.println(b);
        System.out.println("hello world");
    }
}
