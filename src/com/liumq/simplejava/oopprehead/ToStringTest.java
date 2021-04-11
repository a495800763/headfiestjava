package com.liumq.simplejava.oopprehead;

class Apple {
    private String color;
    private double weight;

    public Apple() {
    }

    ;

    //提供有参数的构造器
    public Apple(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "一个苹果，颜色是" + color + ",重量是：" + weight;
    }
}

public class ToStringTest {
    public static void main(String[] args) {
        Apple a = new Apple("red", 5.68);
        System.out.println(a.toString());
    }
}
