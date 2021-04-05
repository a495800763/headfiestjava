package com.liumq.simplejava.classheadfirst;

public class Varargs {
    //定义了形参个数可变的方法
    public static void test(int a,String... books)
    {
        //同类型的books可以被当做数组处理
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        //调用test方法传入参数
        test(5,"疯狂java","高等数学","数据库系统概论");
    }
}
