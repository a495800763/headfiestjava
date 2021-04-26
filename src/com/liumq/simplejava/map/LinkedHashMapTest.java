package com.liumq.simplejava.map;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> scores = new LinkedHashMap<>();
        scores.put("语文", 80);
        scores.put("英语", 82);
        scores.put("数学", 76);
        scores.forEach((s, integer) -> System.out.println(s + "----->" + integer));
    }
}
