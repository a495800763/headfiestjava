package com.liumq.simplejava.systemclasslib;

public class ArgsTest {
    public static void main(String[] args) {
        //输出args数组的长度
        System.out.println(args.length);
        //遍历args的元素
        for (String arg : args) {
            System.out.println(arg);
        }

    }
}