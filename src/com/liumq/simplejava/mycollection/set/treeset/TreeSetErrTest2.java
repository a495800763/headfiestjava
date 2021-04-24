package com.liumq.simplejava.mycollection.set.treeset;


import java.util.Date;
import java.util.TreeSet;

public class TreeSetErrTest2 {
    public static void main(String[] args) {
        TreeSet<Object> ts = new TreeSet<>();
        ts.add(new String("疯狂java讲义"));
        ts.add(new Date());

    }
}
