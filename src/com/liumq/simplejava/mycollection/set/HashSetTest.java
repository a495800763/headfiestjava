package com.liumq.simplejava.mycollection.set;

import java.util.HashSet;
import java.util.Set;

class A {
    //类A 的equals方法总是返回true ，即任意两个类A 对象都equal
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

class B{
    //类B的hashCode()方法总是返回1，即任意两个类B的hashcode相同
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

class  C{
    //类C 的hashcode 和equals 都总是相同
    @Override
    public int hashCode() {
        return 2;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}


public class HashSetTest {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<>();
        set.add(new A());
        set.add(new A());
        set.add(new B());
        set.add(new B());
        set.add(new C());
        set.add(new C());

        System.out.println(set);

    }

}
