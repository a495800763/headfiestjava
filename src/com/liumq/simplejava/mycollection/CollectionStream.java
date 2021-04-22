package com.liumq.simplejava.mycollection;

import java.util.HashSet;
import java.util.Set;

public class CollectionStream {
    public static void main(String[] args) {
        //创建一个集合
        Set<String> books = new HashSet<>();
        books.add("高等数学");
        books.add("线性代数");
        books.add("java编程思想");

        System.out.println(books.stream().filter(q -> q.contains("疯狂")).count());
        System.out.println(books.stream().filter(q -> q.contains("java")).count());
        System.out.println(books.stream().filter(q -> q.length() > 10).count());
        books.stream().mapToInt(q -> q.length()).forEach(System.out::println);
    }
}
