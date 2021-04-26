package com.liumq.simplejava.map;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapErrorTest {
    public static void main(String[] args) {
        HashMap<Object, Object> hm = new HashMap<>();
        hm.put(new A(60000), "疯狂java讲义");
        hm.put(new A(87653), "轻量级javaee企业应用实战");
        //获取hm的keyset集合对应的Iterator迭代器
        Iterator<Object> it = hm.keySet().iterator();
        //取出map中的第一个key并且修改它的值
        A first = (A) it.next();
        first.count = 87563;
        System.out.println(hm);
        //只能删除没有被修改过的key所对应的key-value对
         hm.remove(new A(87563))   ;
         System.out.println(hm);
         //无法获取剩下的value ，下面两行代码都将返回null
        System.out.println(hm.get(new A(87563)));
        System.out.println(hm.get(new A(60000)));
    }
}
