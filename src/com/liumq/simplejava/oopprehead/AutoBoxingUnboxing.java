package com.liumq.simplejava.oopprehead;

/**
 * 包装类型的自动装箱拆箱
 */
public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        //直接把一个基本类型变量赋值给Integer对象
        Integer inObj = 5;
        //直接把一个boolean类型的变量赋值给一个Object类型
        Object boolObj = true;
        //直接把一个Integer对象赋值给一个int 类型的变量
        int it = inObj;
        if (boolObj instanceof Boolean) {
            boolean b = (Boolean) boolObj;
            System.out.println(b);
        }
    }
}
