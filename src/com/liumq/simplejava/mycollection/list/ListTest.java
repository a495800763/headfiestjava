package com.liumq.simplejava.mycollection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * List 的常规用法
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        //向books集合中添加三个元素
        books.add("轻量级javaee企业应用实战");
        books.add("疯狂java讲义");
        books.add("疯狂android讲义");
        System.out.println(books);

        //将新的字符串对象插入在第二个位置
        books.add(1, new String("疯狂Ajax讲义"));
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }

        //删除第三个元素
        books.remove(2);
        System.out.println(books);

        //判断指定元素在list中的index位置
        System.out.println(books.indexOf(new String("疯狂Ajax讲义")));
        //将第二个元素替换成新的字符串
        books.set(1, "线性代数");

        System.out.println(books.subList(1, 2));
    }
}
