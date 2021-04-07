package com.liumq.simplejava.classheadfirst;

public class VariableOverrideTest {
    //定义一个name实例变量
    private String name="李刚";
    //定义一个price类变量
    private static double price = 78.0;

    public static void main(String[] args) {
        //方法里的局部变量不该同名成员变量
        int price = 65;
        System.out.println(price);
        //限定使用名为price 的类变量
        System.out.println(VariableOverrideTest.price);
        new VariableOverrideTest().info();
    }

    private void info() {
        //方法里面局部变量覆盖成员变量
        String name = "孙悟空";
        //输出的是局部变量name
        System.out.println(name);
        //输出的是对象的域 name
        System.out.println(this.name);
    }
}
