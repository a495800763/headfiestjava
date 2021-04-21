package com.liumq.simplejava.systemtest;

import java.util.Objects;

public class ObjectsTest {
    //定义一个Object变量，他的默认值是null
    static ObjectsTest obj = null;

    public static void main(String[] args) {
        System.out.println(Objects.hashCode(obj));
        System.out.println(Objects.toString(obj));
        System.out.println(Objects.requireNonNull(obj,"obj不能为null"));
    }
}
