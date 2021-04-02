package com.liumq.simplejava.conversion;

public class AutoConversion {
    public static void main(String[] args) {
        int a = 6;
        //int类型可以自动转换为float类型
        float f = a;
        //输出float类型的值为6.0
        System.out.println(f);
        byte b = 9;
        //下面的代码将编译报出错,byte类型不能自动转为char类型
        //char c = b;
        //byte类型可以自动转换为double类型
        double d = b;
        System.out.println(d);
    }
}
