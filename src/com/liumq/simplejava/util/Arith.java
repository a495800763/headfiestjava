package com.liumq.simplejava.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/***
 * 浮点数计算的工具类
 */
public class Arith {
    //默认除法运算的精度
    private static final int DEF_DIV_SCALE = 10;

    //私有构造器，使这个类不能在外部实例化
    private Arith() {
    }

    //提供精确的加法运算
    public static double add(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.add(b2).doubleValue();
    }

    //提供精确的减法运算
    public static double sub(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.subtract(b2).doubleValue();
    }

    //提供精确的乘法运算
    public static double mul(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.multiply(b2).doubleValue();
    }

    //提供精确的除法运算
    public static double div(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.divide(b2, DEF_DIV_SCALE, RoundingMode.HALF_UP).doubleValue();
    }

    public static void main(String[] args) {
        System.out.println("0.05+0.01=" + Arith.add(0.05, 0.01));
        System.out.println("1.0 -0.42=" + Arith.sub(1.0, 0.42));
        System.out.println("4.015 *100=" + Arith.mul(4.015, 100));
        System.out.println("123.3 /100=" + Arith.div(123.3, 100));
    }
}
