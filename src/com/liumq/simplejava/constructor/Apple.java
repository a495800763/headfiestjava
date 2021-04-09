package com.liumq.simplejava.constructor;

public class Apple {
    public String color;
    public double weight;
    public String name;

    public Apple() {
    }

    public Apple(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Apple(String name, String color, double weight) {
        //通过this调用另一个重载的构造器的初始化代码，而不产生新的对象，仍然实在操作当前要初始化的这个对象
        this(name, color);
        this.weight = weight;
    }
}
