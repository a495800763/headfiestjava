package com.liumq.simplejava.oopprehead;

public class FinalErrorTest {
    final int age;

    {
        //初始化块的第一句，age 还没有初始化,所以此处代码将引起错误
        //System.out.println(age);
        //这行代码是合法的，程序输出0

        //final 变量不能直接在初始化块中被未赋值却访问，但是却可以套一层方法访问未赋值的final，等到真正赋值时又将其值改变了
        printAge();
        age=6;
        System.out.println(age);
    }

    private void printAge() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        new FinalErrorTest();
    }
}
