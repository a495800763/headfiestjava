package com.liumq.simplejava.oopprehead;

public class NullAccessStatic {
    public static void print() {
        System.out.println("static 关键字修饰的类方法");
    }

    public static void main(String[] args) {
        NullAccessStatic nas = null;
        //一个类的null对象也能访问这个类的类成员，而不是引发空指针异常!!!
        nas.print();
    }
}
