package com.liumq.simplejava.mycollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorTest {
    public static void main(String[] args) {
        //创建一个集合
        Set<String> books = new HashSet<>();
        books.add("高等数学");
        books.add("线性代数");
        books.add("java编程思想");
        Iterator<String> it = books.iterator();
        while (it.hasNext()) {
            //it.next()方法返回的是Object类型，需要进行强制类型转换
            String book = it.next();
            System.out.println(book);
            if (book.equals("线性代数")) {
                //从集合中删除上一次next()返回的元素
                it.remove();
            }
            //对取出的book赋值，不会改变集合元素本身
            book = "测试字符串";
        }
        System.out.println(books);
    }
}
