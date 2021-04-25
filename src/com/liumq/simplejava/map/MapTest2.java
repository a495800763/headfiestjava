package com.liumq.simplejava.map;

import com.liumq.simplejava.classheadfirst.VariableOverrideTest;

import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * jdk1.8中一些新增的map用法
 */
public class MapTest2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("疯狂java讲义", 109);
        map.put("疯狂ios讲义", 10);
        map.put("疯狂Ajax讲义", 79);
        //尝试替换一个不存在的key 的value，但是因为key不存在，
        //map没有改变，也没有添加新的key-value
        map.replace("疯狂XML讲义", 66);
        System.out.println(map);

        //使用原value与传入参数计算出来的结果覆盖原value
        map.merge("疯狂java讲义", 10, new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        });

        //key值为 疯狂java讲义  的value 比之前增大了10
        System.out.println(map);

        //当key值为java 的value 为null 时（或者不存在），使用计算的结果作为新的value
        map.computeIfAbsent("java", new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        });
        System.out.println(map);

        //当key为“java”的value 存在时，使用计算的结果作为新的value
        map.computeIfPresent("java", new BiFunction<String, Integer, Integer>() {
            @Override
            public Integer apply(String s, Integer integer) {
                return integer * integer;
            }
        });

        System.out.println(map);
    }
}
