package com.liumq.simplejava.innerclass;

public class InnerNoStatic {

    private class InnerClass{
        /*下面三个静态声明都将会引发编译异常，因为非静态内部类
        * 中不能有静态声明*/
//        static{
//            System.out.println("----------");
//        }
//
//        private static int inProp;
//        private static void test(){
//
//        }
    }
}
