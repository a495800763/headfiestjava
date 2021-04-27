package com.liumq.simplejava.collections;

import java.util.*;

public class SynchronizedTest {
    public static void main(String[] args) {
        //下面程序创建了4个线程安全的集合对象
        Collection<Object> c = Collections.synchronizedCollection(new ArrayList<>());
        List<Object> list = Collections.synchronizedList(new ArrayList<>());
        Set<Object> s = Collections.synchronizedSet(new HashSet<>());
        Map<Object, Object> m = Collections.synchronizedMap(new HashMap<>());
    }
}
