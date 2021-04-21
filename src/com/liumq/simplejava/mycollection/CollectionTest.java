package com.liumq.simplejava.mycollection;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionTest {
    public static void main(String[] args) {
        ArrayList<Object> c = new ArrayList<>();
        c.add("孙悟空");
        //虽然集合中不能放入基本类型的值，但是java 支持自动装箱
        c.add(6);
        System.out.println("c集合中的元素个数是：" + c.size());
        //删除指定元素
        c.remove(Integer.valueOf(6));
        System.out.println("c集合中的元素个数是：" + c.size());
        //判断是否包含指定字符串
        System.out.println("c集合是否包含\"孙悟空\"字符串" + c.contains("孙悟空"));
        c.add("轻量级javaee企业应用实战");
        System.out.println("c集合的元素：" + c);

        HashSet<Object> books = new HashSet<>();
        books.add("轻量级javaee企业应用实战");
        books.add("疯狂java讲义");
        System.out.println("c集合是否完全包含books集合：" + (c.containsAll(books)));
        //用c 集合减去books集合中的元素
        c.removeAll(books);
        System.out.println("c集合的元素：" + c);
        //删除c集合里所有的元素
        c.clear();
        System.out.println("c集合的元素：" + c);
        books.retainAll(c);
        System.out.println("books集合的元素：" + books);

    }
}
