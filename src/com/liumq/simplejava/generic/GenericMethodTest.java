package com.liumq.simplejava.generic;

import java.util.ArrayList;
import java.util.Collection;

public class GenericMethodTest {
    //声明一个泛型方法,该泛型方法中带一个T泛型形参
    static <T> void fromArray2Collection(T[] a, Collection<T> c) {
        for (T p : a) {
            c.add(p);
        }
    }

    public static void main(String[] args) {
        Object[] oa = new Object[100];
        Collection<Object> co = new ArrayList<>();
        //下面代码中T 代表Object类型
        fromArray2Collection(oa, co);

        String[] sa = new String[100];
        Collection<String> cs = new ArrayList<>();
        //下面代码中T代表String类型
        fromArray2Collection(sa, cs);
        //下面代码中T代表Object类型
        fromArray2Collection(sa, co);
        Integer[] ia = new Integer[100];
        Float[] fa = new Float[100];
        Number[] na = new Number[100];

        Collection<Number> cn = new ArrayList<>();
        //下面代码中 T 代表Number类型
        fromArray2Collection(ia,cn);
        //下面代码中 T 代表Number类型
        fromArray2Collection(fa,cn);
        //下面代码中 T 代表Number类型
        fromArray2Collection(na,cn);

        //下面代码中T代表Object类型
        fromArray2Collection(na,co);

        //下面代码将出现编译错误，因为Na的类型不是cs的类型的子类
        //fromArray2Collection(na,cs);

    }
}
