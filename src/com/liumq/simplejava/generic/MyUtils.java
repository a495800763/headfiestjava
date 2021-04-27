package com.liumq.simplejava.generic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 逆变测试
 */
public class MyUtils {
    //下面dest集合元素的类型必须与src集合元素的类型相同，或者是其父类
    public static <R> R copy(Collection<? super R> dest, Collection<R> src) {
        R last = null;
        for (R ele : src) {
            last = ele;
            //逆变的泛型集合添加元素是安全操作
            dest.add(ele);
        }
        return last;
    }

    public static void main(String[] args) {
        ArrayList<Number> ln = new ArrayList<>();
        ArrayList<Integer> li = new ArrayList<>();
        li.add(5);
        //把integer(子类) 类型复制到Number（父类） 类型中
        Integer copy = copy(ln, li);
        System.out.println(ln);
    }
}
