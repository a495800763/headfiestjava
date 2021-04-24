package com.liumq.simplejava.mycollection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> books = new LinkedHashSet<>();
        books.add("疯狂java讲义");
        books.add("轻量级javaee企业应用实践");
        System.out.println(books);
        //删除 第一本书
        books.remove("疯狂java讲义");
        //重新添加，
        books.add("疯狂java讲义");
        System.out.println(books);
    }
}
