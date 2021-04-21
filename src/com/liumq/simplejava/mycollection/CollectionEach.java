package com.liumq.simplejava.mycollection;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class CollectionEach {
    public static void main(String[] args) {
        //创建一个集合
        Set<String> books = new HashSet<>();
        books.add("高等数学");
        books.add("线性代数");
        books.add("java编程思想");
        books.forEach(s -> System.out.println("迭代集合元素：" + s));

    }
}
