package com.liumq.simplejava.generic;

public class Apple<T> {
    //使用T类型定义其实例变量
    private T info;

    public Apple() {
    }

    //下面使用T类型来定义构造器
    public Apple(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public static void main(String[] args) {
        Apple<String> a1 = new Apple<>("苹果");
        System.out.println(a1.getInfo());

        Apple<Double> a2 = new Apple<>(5.67);
        System.out.println(a2.getInfo());

    }
}
