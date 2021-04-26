package com.liumq.simplejava.map;

import java.util.HashMap;

public class NullInHashMap {
    public static void main(String[] args) {
        HashMap<Object, Object> hm = new HashMap<>();
        //试图将两个null值做key放入key-value的hashMap中
        hm.put(null, null);
        hm.put(null, null);
        //将一个value 为null 的对放入map
        hm.put("a", null);
        System.out.println(hm);
    }
}
