package com.liumq.simplejava.mycollection.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {
    public static void main(String[] args) {
        HashSet<R> hs = new HashSet<>();
        hs.add(new R(5));
        hs.add(new R(-3));
        hs.add(new R(9));
        hs.add(new R(2));
        //打印hashset集合，元素没有重复
        System.out.println(hs);

        Iterator<R> it = hs.iterator();
        //取出第一个元素
        R first = it.next();
        //为第一个元素的count实例变量赋值
        first.count=5;
        //再次打印hashset集合，有重复元素
        System.out.println(hs);
        //删除count=-3 的R 对象
        hs.remove(new R(5));
        //可以看到被删除了一个R 元素
        System.out.println(hs);

        System.out.println("hs是否包含count=5的对象："+(hs.contains(new R(5))));
        System.out.println("hs是否包含count=-2的对象："+(hs.contains(new R(-2))));

    }
}

class R {
    int count;

    public R(int count) {
        this.count = count;
    }

    public String toString() {
        return "R[count:" + count + "]";
    }

    @Override
    public int hashCode() {
        return count;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == R.class) {
            R r = (R) obj;
            return this.count == r.count;
        }
        return false;
    }
}
