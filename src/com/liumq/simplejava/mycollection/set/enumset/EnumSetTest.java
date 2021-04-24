package com.liumq.simplejava.mycollection.set.enumset;

import java.util.EnumSet;

enum season {
    SPRING, SUMMER, FALL, WINTER
}

public class EnumSetTest {
    public static void main(String[] args) {
        //创建一个EnumSet集合，集合的元素就是Season枚举类的全部枚举值
        EnumSet<season> es1 = EnumSet.allOf(season.class);
        System.out.println(es1);
        //创建一个EnumSet 的空集合，指定其元素只能是Season枚举类中的值
        EnumSet<season> es2 = EnumSet.noneOf(season.class);
        System.out.println(es2);
        //手动添加两个元素
        es2.add(season.WINTER);
        es2.add(season.SPRING);
        System.out.println(es2);

        //以指定枚举值创建EnumSet集合
        EnumSet<season> es3 = EnumSet.of(season.SUMMER, season.WINTER);
        System.out.println(es3);
        //以指定区间创建EnumSet集合
        EnumSet<season> es4 = EnumSet.range(season.SUMMER, season.WINTER);
        //用枚举中的其他元素将es4补齐 ，即es5 是es4的补集
        EnumSet<season> es5 = EnumSet.complementOf(es4);
        System.out.println(es5);
    }
}
