package com.liumq.simplejava.array;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class ArraysTest2 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{3, -4, 25, 16, 30, 18};
        //对数组进行并发排序
        Arrays.parallelSort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[]{3, -4, 25, 16, 30, 18};

        Arrays.parallelPrefix(arr2, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                //新数组等于原数组左右相乘
                return left * right;
            }
        });

        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[5];

        Arrays.parallelSetAll(arr3, new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                //新数组等于其数组下表乘以5
                return operand*5;
            }
        });

        System.out.println(Arrays.toString(arr3));
    }
}
