package com.liumq.simplejava.generic;

import java.util.ArrayList;
import java.util.List;

public class Cancas {
    /**
     * 同时在画布上话多个同一类形状
     *
     * @param shapes 使用通配符限定必须是shape的子类
     */
    public void drwaAll(List<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw(this);
        }
    }

    public static void main(String[] args) {
        List<Circle> circleList = new ArrayList<>();
        circleList.add(new Circle());
        circleList.add(new Circle());

        circleList.add(new Circle());

        Cancas c = new Cancas();
        c.drwaAll(circleList);
    }
}
