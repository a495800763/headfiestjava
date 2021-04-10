package com.liumq.simplejava.extendsheadfirst;

class Base {
    public Base() {
        this.test();
    }

    public void test() {
        System.out.println("父类中将要被子类重写的方法");
    }
}

public class SubErrorExample extends Base {
    private String name;

    @Override
    public void test() {
        System.out.println("子类重写父类的方法,其name变量的长度是:" + name.length());
    }

    public static void main(String[] args) {
        SubErrorExample sb = new SubErrorExample();
    }
}
