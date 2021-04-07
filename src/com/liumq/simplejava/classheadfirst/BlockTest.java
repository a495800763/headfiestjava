package com.liumq.simplejava.classheadfirst;

public class BlockTest {
    public static void main(String[] args) {
        {
            //定义一个代码块局部变量
            int a;
            //System.out.println("代码块局部变量a的值是："+a);
            a = 5;
            System.out.println("代码块局部变量a的值是："+a);
        }
        //离开代码块后  代码块中定义的局部变量a并不存在
        //System.out.println(a);
    }
}
