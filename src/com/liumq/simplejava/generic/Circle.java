package com.liumq.simplejava.generic;

public class Circle extends Shape {
    @Override
    public void draw(Cancas c) {
        System.out.println("在画布：" + c + "上画一个【圆】");
    }
}
