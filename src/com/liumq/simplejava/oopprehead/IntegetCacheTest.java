package com.liumq.simplejava.oopprehead;

/**
 * Integer类的valueOf方法是使用缓存不可变类实现的
 */
public class IntegetCacheTest {
    public static void main(String[] args) {
        //生成新的Integer类对象
        Integer in1 = new Integer(6);
        Integer in2 = Integer.valueOf(6);
        //直接从缓存中取得Integer对象
        Integer in3 = Integer.valueOf(6);
        System.out.println(in3 == in1);
        System.out.println(in3 == in2);

        //但是Integer 只缓存 -128~127 的值
        Integer in4 = Integer.valueOf(200);
        Integer in5 = Integer.valueOf(200);
        System.out.println(in4 == in5);

    }
}
