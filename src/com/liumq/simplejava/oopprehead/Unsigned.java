package com.liumq.simplejava.oopprehead;

public class Unsigned {
    public static void main(String[] args) {
        byte b = -3;
        //将byte类型的-3转换为无符号的整数
        int unsignedInt = Byte.toUnsignedInt(b);
        System.out.println("byte类型的-3对应的无符号整数是:" + unsignedInt);

        //指定使用十六进制解析无符号整数
        int val = Integer.parseUnsignedInt("ab", 16);
        System.out.println(val);
        //将-12转换为无符号int型，然后转换为十六进制的字符串
        System.out.println(Integer.toUnsignedString(-12,16));

        //将两个数转换成无符号数之后相除
        System.out.println(Integer.divideUnsigned(-2,3));

        //将两个数转换为无符号整数后相除后求余
        System.out.println(Integer.remainderUnsigned(-2,7));
    }
}
