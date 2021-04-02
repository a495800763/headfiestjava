package com.liumq.simplejava.opreation;

/**
 * 位操作
 */
public class BitOpreation {
    public static void main(String[] args) {
        //00000101 & 00001001
        System.out.println(5 & 9);
        //00000101 | 00001001
        System.out.println(5 | 9);

        //-5按位取反
        System.out.println(~-5);
        //5 9  按位异或 (相同为1，相异为0)
        System.out.println(5 ^ 9);

        //左移两位 00000101(1+4)->00010100 (4+16)
        //左移N位相当于 *(2^n)
        System.out.println(5<<2);
         //左移两位
        System.out.println(-5<<2);

        //右移两位(最高位用符号填充 - 号)
        //右移N位相当于 /(2^n)
        System.out.println(-5>>2);
        // 无符号右移两位（最高位用0填充）
        System.out.println(-5>>>2);
    }
}
