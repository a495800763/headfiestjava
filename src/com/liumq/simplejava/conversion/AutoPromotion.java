package com.liumq.simplejava.conversion;

/**
 * 表达式中数据类型的自动提升
 */
public class AutoPromotion {
    public static void main(String[] args) {
        short sValue = 5;
        //sValue =sValue- 2;

        byte b = 40;
        char c = 'a';
        int i = 23;
        double d = .314;

        //表达式右边的最高等级操作数为double  则 右边运算结果是一个double类型
        double result = b + c + i * d;
        //将输出 144.222
        System.out.println(result);


        int val = 3;
        int intResule = 23 / val;
        //输出int类型的  7
        System.out.println(intResule);


        System.out.println("Hello!" + 'a' + 7);
        System.out.println('a' + 7 + "Hello!");

    }
}
