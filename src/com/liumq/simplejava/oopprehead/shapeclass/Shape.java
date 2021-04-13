package com.liumq.simplejava.oopprehead.shapeclass;

public abstract class Shape {
    {
        System.out.println("执行 Shape 的初始化块");
    }

    private String color;

    //定义一个计算周长的抽象方法，表明一个Shape类是可以得到其周长的
    public abstract double calPerimeter();

    //定义一个返回其形状的抽象方法，但是shape类并不知道子类的具体形状，无法实现
    public abstract String getType();

    //定义一个构造器，该构造器只能被子类调用，不能单独用来创建同类对象
    public Shape() {
    }

    public Shape(String color) {
        System.out.println("执行shape 的构造器");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
