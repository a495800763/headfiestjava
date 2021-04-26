package com.liumq.simplejava.map;

import java.util.Hashtable;

class A {
    int count;

    public A(int count) {
        this.count = count;
    }

    /**
     * 根据count 值来判断两个对象是否相等
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return count == a.count;
    }

    /**
     * 根据count 来计算hashCode值
     *
     * @return
     */
    @Override
    public int hashCode() {
        return this.count;
    }
}

class B {
    //重写equals方法，B对象与任何对象通过equals方法比较都返回false

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<Object, Object> ht = new Hashtable<>();
        ht.put(new A(60000), "疯狂java讲义");
        ht.put(new A(87653), "轻量级javaee企业应用实战");
        ht.put(new A(1232), new B());

        System.out.println(ht);

        /* 只要两个对象通过equals方法返回true
        hashtable 就认为他们是两个相同的value
        由于B对象与任何对象对比都返回true ，因此下面代码返回true
        * */
        System.out.println(ht.containsValue("测试字符串"));

        // 重写了A 的 equals 和 hashcode方法，因此相同count 的A对象被认为是同一个A 对象
        System.out.println(ht.containsKey(new A(87653)));

        //下面的语句可以删除最后一组 key value
        ht.remove(new A(1232));

        System.out.println(ht);
    }
}
