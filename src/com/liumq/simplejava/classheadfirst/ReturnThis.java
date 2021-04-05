package com.liumq.simplejava.classheadfirst;

public class ReturnThis {
    public int age;

    public ReturnThis grow() {
        this.age++;
        return this;
    }

    public static void main(String[] args) {
        ReturnThis rt = new ReturnThis();
        rt.grow().grow().grow();
        System.out.println("rt 的age成员变量当前的值是：" + rt.age);
    }
}
