package com.liumq.simplejava.mycollection;

import java.util.HashSet;
import java.util.Set;

public class ForeachTest {
    public static void main(String[] args) {
        //创建一个集合
        Set<String> books = new HashSet<>();
        books.add("高等数学");
        books.add("线性代数");
        books.add("java编程思想");
        for (String book : books) {
            System.out.println(book);
            if (book.equals("高等数学")) {
                books.remove(book);
            }
        }

        System.out.println(books);

    }
}
