package com.liumq.simplejava.oopprehead.shapeclass;

public class Triangle extends Shape {
    //定义三角形的三边
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.setSides(a, b, c);
    }

    private void setSides(double a, double b, double c) {
        if (a >= c + b || b >= c + a || c >= a + b) {
            System.out.println("三角形两边之和应该大于第三边，否则无法构造");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calPerimeter() {
        return a + b + c;
    }

    @Override
    public String getType() {
        return getColor() + "三角形";
    }
}
