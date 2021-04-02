package com.liumq.simplejava.conversion;

import sun.nio.cs.ext.IBM037;

/**
 * 强制类型转换
 */
public class NarrowConversion {
    public static void main(String[] args) {
        int iValue = 233;
        //强制把一个int类型的值转换为byte类型的值
        byte bValue = (byte) iValue;
        //将输出-23 （溢出）
        System.out.println(bValue);

        double dValue = 3.98d;
        //强制把一个double 类型的值转换为int类型的值
        int tol = (int) dValue;
        //将输出 3
        System.out.println(tol);
    }
}
