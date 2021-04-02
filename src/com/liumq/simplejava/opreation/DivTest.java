package com.liumq.simplejava.opreation;

public class DivTest {
    public static void main(String[] args) {
        double a = 5.2;
        double b = 3.1;
        double div = a / b;

        //div的值可以求出
        System.out.println(div);
        // 任何数除以浮点数的0.0 都是无穷大
        System.out.println(5 / 0.0);
        // 负无穷大
        System.out.println(-5 / 0.0);

        //任何数都不能除以整形的0，抛出错误
        System.out.println(5 / 0);
    }
}
