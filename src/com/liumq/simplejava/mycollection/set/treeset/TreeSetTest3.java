package com.liumq.simplejava.mycollection.set.treeset;

import java.sql.PseudoColumnUsage;
import java.util.TreeSet;

class R implements Comparable {
    int count;

    public R(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "R[count:" + count + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == R.class) {
            R r = (R) obj;
            return r.count == this.count;
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        R r = (R) o;
        return count > r.count ? 1 : count < r.count ? -1 : 0;
    }
}

public class TreeSetTest3 {
    public static void main(String[] args) {
        TreeSet<R> ts = new TreeSet<>();
        ts.add(new R(5));
        ts.add(new R(-3));
        ts.add(new R(9));
        ts.add(new R(-2));

        //打印ts集合，集合元素是有序的  因为重写了compareTo方法
        System.out.println(ts);
        //取出第一个元素
        R first = ts.first();
        first.count = 20;
        //取出最后一个元素
        R last = ts.last();
        //对最后一个元素的count赋值，与第二个元素的count相同
        last.count = -2;
        //再次输出将看到ts的元素处于无序状态，且有重复元素
        System.out.println(ts);
        //删除实例变量被改变的元素，删除失败
        System.out.println(ts.remove(new R(-2)));
        System.out.println(ts);
        //删除实例变量未被改动过得元素，可以删除
        System.out.println(ts.remove(new R(5)));
        System.out.println(ts);
    }
}
