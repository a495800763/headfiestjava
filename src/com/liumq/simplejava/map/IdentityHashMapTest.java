package com.liumq.simplejava.map;

import java.util.IdentityHashMap;

public class IdentityHashMapTest {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> ihm = new IdentityHashMap<>();

        ihm.put(new String("语文"), 99);
        ihm.put(new String("语文"), 107);


        ihm.put("java", 93);

        ihm.put("java", 98);

        System.out.println(ihm);


    }
}
