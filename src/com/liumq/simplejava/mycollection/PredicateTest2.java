package com.liumq.simplejava.mycollection;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class PredicateTest2 {
    public static void main(String[] args) {
        HashSet<String> books = new HashSet<>();
        books.add("轻量级javaee企业应用实战");
        books.add("疯狂java讲义");
        books.add("疯狂IOS讲义");
        books.add("疯狂Ajax讲义");
        books.add("疯狂android讲义");
        System.out.println(callAll(books, (Predicate<String>) o -> o.contains("疯狂")));
        System.out.println(callAll(books,ele->((String)ele).contains("java")));
        System.out.println(callAll(books,ele->((String)ele).length()>10));
    }

    public static int callAll(Collection books, Predicate p) {
        int total = 0;
        for (Object obj : books) {
            //检查obj对象是否满足p的条件
            if (p.test(obj)) {
                total++;
            }
        }
        return total;
    }
}
