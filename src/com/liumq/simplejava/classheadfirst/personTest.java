package com.liumq.simplejava.classheadfirst;

class MyPerson {
    public String name;
    public static int eyeNum;
}

public class personTest {
    public static void main(String[] args) {
        //第一次主动使用MyPerson类，该类自动初始化 ，则eyeNum变量开始起作用，输出0
        System.out.println("MyPerson类的eyeNum变量的值:" + MyPerson.eyeNum);
        //创建MyPerson对象
        MyPerson p = new MyPerson();
        //通过MyPerson对象的引用p来访问Myperson对象name实例变量
        //并且通过实例访问eyeNum 类变量
        System.out.println("p变量的name变量值是：" + p.name + ";p对象的eyeNum变量值是：" + p.eyeNum);
        // 直接为name实例变量赋值
        p.name = "孙悟空";
        //再次通过对象的引用访问实例变量和类变量
        p.eyeNum = 2;
        System.out.println("p变量的name变量值是：" + p.name + ";p对象的eyeNum变量值是：" + p.eyeNum);
        System.out.println("MyPerson类变量eyeNum此时是：" + MyPerson.eyeNum);
        MyPerson p2 = new MyPerson();
        System.out.println("另外一个对象的eyeNum实例的值现在是:" + p2.eyeNum);
    }
}
