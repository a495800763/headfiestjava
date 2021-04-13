package com.liumq.simplejava.oopprehead.shapeclass;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Triangle("黑色",3,4,5);
        Shape s2 = new Circle("紫色",3);

        System.out.println(s1.getType());
        System.out.println(s1.calPerimeter());
        System.out.println(s2.getType());
        System.out.println(s2.calPerimeter());
    }
}
