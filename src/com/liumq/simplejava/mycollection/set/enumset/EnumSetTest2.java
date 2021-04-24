package com.liumq.simplejava.mycollection.set.enumset;

import java.util.EnumSet;
import java.util.HashSet;


public class EnumSetTest2 {
    public static void main(String[] args) {
        HashSet<season> c = new HashSet<>();
        c.clear();
        c.add(season.FALL);
        c.add(season.SPRING);
        //复制Collection集合中的所有元素来创建EnumSet集合
        EnumSet<season> enumSet = EnumSet.copyOf(c);
        System.out.println(enumSet);
        //c.add("疯狂java讲义");
    }
}
