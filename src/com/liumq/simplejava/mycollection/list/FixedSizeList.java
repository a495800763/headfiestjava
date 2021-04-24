package com.liumq.simplejava.mycollection.list;

import java.util.Arrays;
import java.util.List;

/**
 * 固定长度的list
 */
public class FixedSizeList {
    public static void main(String[] args) {
        //使用该方法创建的是长度不可变的只读list，其实是Arrays 的一个内部类
        List<String> fixedList = Arrays.asList("疯狂java讲义", "轻量级javaee企业应用实战");
        System.out.println(fixedList.getClass());

        fixedList.forEach(System.out::println);

        //这个类并不能删除和添加元素，将报错
        fixedList.add("疯狂android讲义");
        fixedList.remove("疯狂java讲义");

    }
}
