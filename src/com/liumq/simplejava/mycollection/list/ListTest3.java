package com.liumq.simplejava.mycollection.list;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.UnaryOperator;

public class ListTest3 {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("轻量级javaee企业应用实战");
        books.add("疯狂java讲义");
        books.add("疯狂android讲义");
        books.add("疯狂ios讲义");

        //使用目标类型为Comparator 的Lambda表达式对目标进行排序
        books.sort((p, q) -> {
            return p.length() - q.length();
        });

        System.out.println(books);

        //books.replaceAll(s -> s.length());
    }
}
