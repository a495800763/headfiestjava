package com.liumq.simplejava.extendsheadfirst;

class Root {
    static {
        System.out.println("Root类的类初始化块");
    }

    {
        System.out.println("Root类的实例初始化块");
    }

    public Root() {
        System.out.println("Root类的无参数构造器");
    }
}

class Mid extends Root {
    static {
        System.out.println("Mid类的类初始化块");
    }

    {
        System.out.println("Mid类的实例初始化块");
    }

    public Mid() {
        System.out.println("Mid类的无参数构造器");
    }

    public Mid(String msg) {
        this();
        System.out.println("Mid类的带参数构造器，其参数值是：" + msg);
    }
}
class Leaf extends Mid{
    static {
        System.out.println("Leaf类的类初始化块");
    }

    {
        System.out.println("Leaf类的实例初始化块");
    }
    public Leaf(){
        super("疯狂java讲义");
        System.out.println("执行Leaf类的无参数构造器");
    }
}

public class MyTest {
    public static void main(String[] args) {
        new Leaf();
        new Leaf();
    }
}
