package com.liumq.simplejava.mycollection.list;

import java.util.ArrayList;

class A {
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

public class ListTest2 {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("轻量级javaee企业应用实战");
        books.add("疯狂java讲义");
        books.add("疯狂android讲义");

        System.out.println(books);

        //删除集合中的A对象，将导致第一个元素被删除
        books.remove(new A());
        System.out.println("删除一次，剩余元素："+books);
        books.remove(new A());
        System.out.println("删除两次，剩余元素："+books);
    }
}
