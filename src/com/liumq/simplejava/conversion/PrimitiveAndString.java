package com.liumq.simplejava.conversion;

public class PrimitiveAndString {
    public static void main(String[] args) {
        //下面代码是错误的 ，一个整数不能赋值给String类型
        //String a = 5;
        //一个基本类型的值和String类型进行连接运算时，基本类型将被转换成String
        String str2 = 3.5f + "";
        System.out.println(str2);
        //下面的语句将输出 7Hello!
        System.out.println(3+4+"Hello!");
        //下面的语句将输出Hello!34
        System.out.println("Hello!"+3+4);
    }
}
