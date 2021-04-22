package com.liumq.simplejava.mycollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorErrorTest {
    public static void main(String[] args) {
        //创建一个集合
        Set<String> books = new HashSet<>();
        books.add("高等数学");
        books.add("线性代数");
        books.add("java编程思想");
        Iterator<String> it = books.iterator();
        while (it.hasNext()) {
            String book = it.next();
            System.out.println(book);
            if (book.equals("线性代数")) {
                //使用迭代器过程中不能对迭代器绑定的集合进行删除操作
                // books.remove(book);
            }
        }
    }
}
