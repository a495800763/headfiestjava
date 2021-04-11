package com.liumq.simplejava.oopprehead;

/**
 * final类变量相关
 */
public class FinalVariableTest {
    //定义成员变量是直接指定默认值，合法
    final int a = 6;
    //下面的变量将在构造器或初始化块中分配初始值
    final String str;
    final int c;
    final static double d;
    //既没有指定初始值，又没有在初始化块或者构造器中指定初始值的实例变量是不合法的
    //final int ch;

    //初始化块，可以对没有指定默认值的实例变量指定初始值并全程不可以再改变
    {
        str="hello";
        //定义a实例变量时已经指定了默认值，且a为final变量，不能在更改其值，下面语句会编译出错
        //a=8;
    }
    //静态初始化块中可以对final类变量进行初始化
    static {
        d=5.6;
    }
    //构造器中可以对既没有默认值，有没有在初始化块中初始化的final值赋值
    public FinalVariableTest(){
        c =5;
        //变量str已经在初始化块中赋值，且为final，因此不能在构造器中赋值
        //str="高中数学";

    }

    public void chaneFinal(){
        // final 修饰的成员变量均无法在普通方法中再次修改
        //d=1.2;
        //c=4;
    }

    public static void main(String[] args) {
        FinalVariableTest ft = new FinalVariableTest();
        System.out.println(ft.a);
        System.out.println(ft.c);
        System.out.println(ft.d);
    }
}
