package com.liumq.simplejava.systemtest;

import java.math.BigDecimal;

/**
 * 高精度浮点类型的测试
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        //使用字符串创建BigDecimal将能得到准确值
        BigDecimal f1 = new BigDecimal("0.05");
        BigDecimal f2 = BigDecimal.valueOf(0.01);
        //直接使用double类型数据作为参数构造 将会丢失精度，因为double 本身就是不准确的
        BigDecimal f3 = new BigDecimal(0.05);

        System.out.println(f1.add(f2));
        System.out.println(f1.subtract(f2));
        System.out.println(f1.multiply(f2));
        System.out.println(f1.divide(f2));
        System.out.println("===============");

        System.out.println(f3.add(f2));
        System.out.println(f3.subtract(f2));
        System.out.println(f3.multiply(f2));
        System.out.println(f3.divide(f2));

    }
}
