package com.liumq.simplejava.map;

import java.util.Objects;
import java.util.TreeMap;

class R implements Comparable {
    int count;

    public R(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "R{" +
                "count=" + count +
                '}';
    }

    //根据count 来判断两个对象是否相等

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        R r = (R) o;
        return count == r.count;
    }

    @Override
    public int compareTo(Object o) {
        R r = (R) o;
        return count > r.count ? 1 : count < r.count ? -1 : 0;
    }
}

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<R, String> tm = new TreeMap<>();

        tm.put(new R(3), "轻量级javaee企业应用实战");
        tm.put(new R(-5), "疯狂java讲义");
        tm.put(new R(-9), "疯狂android讲义");
        System.out.println(tm);
        //返回该treemap 的第一个entry对象
        System.out.println(tm.firstEntry());
        //返回该treemap的最后一个key值
        System.out.println(tm.lastKey());
        //返回该treemap的比 new R(2)大的最小key值
        System.out.println(tm.higherKey(new R(2)));
        //返回该treemap的比 new R(2)小的最大key值
        System.out.println(tm.lowerEntry(new R(2)));
        //返回该treemap的子map
        System.out.println(tm.subMap(new R(-1), new R(4)));

    }
}
