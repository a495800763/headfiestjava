package com.liumq.simplejava.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ErrorTest {
    //声明一个泛型方法,该泛型方法中带一个T泛型形参
    static <T> void fromArray2Collection(Collection<? extends T> from, Collection<T> to) {
        for (T ele : from) {
            to.add(ele);
        }
    }

    public static void main(String[] args) {
        List<Object> ao = new ArrayList<>();
        List<String> as = new ArrayList<>();
        //下面代码将产生编译错误

        fromArray2Collection(as, ao);
    }
}
