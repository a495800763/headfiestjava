package com.liumq.simplejava.systemtest;

/**
 * 测试浮点数类型的精度丢失情况
 */
public class DoubleTest {
    public static void main(String[] args) {
        System.out.println("0.05+0.01=" + (0.05 + 0.01));
        System.out.println("1.0 - 0.42=" + (1.0 - 0.42));
        System.out.println("4.015 * 100=" + (4.015 * 100));
        System.out.println("123.3 / 100=" + (123.3 / 100));
    }
}
