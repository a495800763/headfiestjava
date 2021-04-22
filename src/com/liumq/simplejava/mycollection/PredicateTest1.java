package com.liumq.simplejava.mycollection;

import java.util.HashSet;
import java.util.function.Predicate;

public class PredicateTest1 {
    public static void main(String[] args) {
        HashSet<String> books = new HashSet<>();
        books.add("轻量级javaee企业应用实战");
        books.add("疯狂java讲义");
        books.add("疯狂IOS讲义");
        books.add("疯狂Ajax讲义");
        books.add("疯狂android讲义");
        books.removeIf(s -> s.length()<10);

        System.out.println(books);


    }
}
