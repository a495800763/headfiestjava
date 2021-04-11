package com.liumq.simplejava.oopprehead;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
}

public class PrintObject {
    public static void main(String[] args) {
        //创建一个Person对象，赋给p变量
        Person p  = new Person("习近平");
        System.out.println(p);

    }
}
