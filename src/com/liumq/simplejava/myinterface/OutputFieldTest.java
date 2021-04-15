package com.liumq.simplejava.myinterface;

public class OutputFieldTest {
    public static void main(String[] args) {
        //访问另一个包中的Output接口的成员变量
        System.out.println(Output.MAX_CACHE_LINE);

        //下面的接口成员变量赋值语句编译错误
        //接口的成员变量默认是 public static final 类型
        //Output.MAX_CACHE_LINE=20;
        //使用接口来调用其静态方法
        System.out.println(Output.staticTest());
    }
}
