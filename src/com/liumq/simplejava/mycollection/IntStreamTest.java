package com.liumq.simplejava.mycollection;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class IntStreamTest {
    public static void main(String[] args) {
        IntStream is = IntStream.builder()
                .add(20)
                .add(13)
                .add(-2)
                .add(18)
                .build();
        //下面调用聚集方法的代码每次只能执行一行
        //System.out.println("is所有元素的最大值：" + is.max().getAsInt());
        //System.out.println("is所有元素的最小值：" + is.min().getAsInt());
        //System.out.println("is所有元素的总和：" + is.sum());
        //System.out.println("is所有元素的总数：" + is.count());
        System.out.println("is所有元素的平均值：" + is.average());
        //System.out.println("is所有元素的平方是否都大于20：" + is.allMatch(p -> p * p > 20));
        //System.out.println("is至少包含一个元素平方大于20：" + is.anyMatch(q -> q * q > 20));
//        IntStream newIs = is.map(k -> k * 2 + 1);
//        newIs.forEach(System.out::println);
//        newIs.forEach(new IntConsumer() {
//            @Override
//            public void accept(int value) {
//                System.out.println(value);
//            }
//        });

    }
}
