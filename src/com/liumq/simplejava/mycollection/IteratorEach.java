package com.liumq.simplejava.mycollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorEach {
    public static void main(String[] args) {
        //创建一个集合
        Set<String> books = new HashSet<>();
        books.add("高等数学");
        books.add("线性代数");
        books.add("java编程思想");
        Iterator<String> it = books.iterator();
        it.forEachRemaining(s -> System.out.println("迭代集合元素：" + s));
    }
}
