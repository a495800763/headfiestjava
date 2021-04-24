package com.liumq.simplejava.mycollection.set.treeset;

import java.util.TreeSet;

class Err{

}
public class TreeSetErrTest {
    public static void main(String[] args) {
        TreeSet<Object> ts = new TreeSet<>();
        ts.add(new Err());
    }
}
