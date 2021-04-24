package com.liumq.simplejava.mycollection.set.treeset;

import java.util.TreeSet;

class Z implements Comparable {

    int age;

    public Z(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

public class TreeSetTest2 {
    public static void main(String[] args) {
        TreeSet<Z> set = new TreeSet<>();
        Z z1 = new Z(6);
        set.add(z1);
        //第二次添加相同对象，输出他true，表明可以被添加
        System.out.println(set.add(z1));
        //输出set ，将看到两个元素
        System.out.println(set);
        //修改集合的第一个元素的age 变量
        set.first().age=9;
        System.out.println(set.last().age);
    }
}
