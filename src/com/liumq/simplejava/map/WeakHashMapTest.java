package com.liumq.simplejava.map;

import java.util.WeakHashMap;

/**
 * 弱引用的hashmap测试
 */
public class WeakHashMapTest {
    public static void main(String[] args) {
        WeakHashMap<String, String> whm = new WeakHashMap<>();
        whm.put(new String("语文"), new String("良好"));
        whm.put(new String("数学"), new String("及格"));
        whm.put(new String("英语"), new String("中等"));
        //向map中添加一个keyvalue对m，该key是一个系统缓存的字符串对象，GC 时不会回收
        whm.put("java", new String("中等"));

        System.out.println(whm);

        System.gc();

        System.runFinalization();

        System.out.println(whm);
    }
}
