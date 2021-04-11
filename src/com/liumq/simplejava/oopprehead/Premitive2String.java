package com.liumq.simplejava.oopprehead;

public class Premitive2String {
    public static void main(String[] args) {
        String intStr = "123";
        //把一个特定字符串转换为int变量
        int it1 = Integer.parseInt(intStr);
        Integer int2 = Integer.valueOf(intStr);
        System.out.println(int2);

        String floatStr = "4.56";
        float ft1 = Float.parseFloat(floatStr);
        Float ft2 = Float.valueOf(floatStr);
        System.out.println(ft2);

        //把一个float类型变量转换为String变量
        String ftStr = String.valueOf(1.234f);
        System.out.println(ftStr);

        //把一个double 类型变量转换为String变量
        String dbStr = String.valueOf(3.344);
        System.out.println(dbStr);

        //把一个boolean类型变量转换为String变量
        String boolStr = String.valueOf(true);
        System.out.println(boolStr);
    }
}
