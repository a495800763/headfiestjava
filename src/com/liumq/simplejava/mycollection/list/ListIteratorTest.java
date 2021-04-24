package com.liumq.simplejava.mycollection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        String[] books = {"疯狂java讲义", "疯狂ios讲义", "轻量级javaee企业应用实战"};
        List<String> bookList = new ArrayList<>();
        for (int i = 0; i < books.length; i++) {
            bookList.add(books[i]);
        }

        ListIterator<String> lit = bookList.listIterator();
        //从前向后遍历
        while (lit.hasNext()) {
            System.out.println(lit.next());
            lit.add("------分隔符------");
        }
        System.out.println("======接着开始反向迭代======");
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }

    }
}
