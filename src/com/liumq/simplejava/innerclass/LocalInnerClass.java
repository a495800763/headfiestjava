package com.liumq.simplejava.innerclass;

/**
 * 局部内部类
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        //在方法中定义类，则为局部内部类
        class InnerBase {
            int a;
        }
        //定义局部内部类的子类
        class InnerSub extends InnerBase {
            int b;
        }

        InnerSub is = new InnerSub();
        is.a = 5;
        is.b = 8;
        System.out.println("InnerSub对象的a和b实例变量的值是：" + is.a + "," + is.b);
    }
}
