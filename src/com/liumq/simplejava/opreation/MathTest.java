package com.liumq.simplejava.opreation;

public class MathTest {
    public static void main(String[] args) {
        double a = 3.2;
        //b为a的5次方
        double b = Math.pow(a, 5);
        System.out.println(b);
        //c 为a的平方根
        double c = Math.sqrt(a);
        System.out.println(c);
        //计算随机数，返回一个0-1 之间的随机数
        double d = Math.random();
        System.out.println(d);
        //求1.57 的sin 函数值，1.57 为弧度
        double e = Math.sin(1.57);
        System.out.println(e);
    }
}
