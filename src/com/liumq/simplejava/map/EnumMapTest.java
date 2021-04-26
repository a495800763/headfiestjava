package com.liumq.simplejava.map;

import java.util.EnumMap;

enum Season {
    SPRING, SUMMER, FALL, WINTER
}

public class EnumMapTest {
    public static void main(String[] args) {
        EnumMap enumMap = new EnumMap(Season.class);
        enumMap.put(Season.SUMMER, "炎炎夏日");
        enumMap.put(Season.SPRING, "春意盎然");

        System.out.println(enumMap);
    }
}
