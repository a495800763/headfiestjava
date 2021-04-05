package com.liumq.simplejava.array;

import java.util.Arrays;

/**
 * 数组操作的工具类Arrays
 */
public class ArraysTest {
    public static void main(String[] args) {
        //定义一个数组a
        int[] a = new int[]{3, 4, 5, 6};
        //定义一个数组a2
        int[] a2 = new int[]{3, 4, 5, 6};
        System.out.println("数组a和a2是否相等：" + Arrays.equals(a, a2));

        int[] b = Arrays.copyOf(a, 6);
        System.out.println("数组a和b是否相等：" + Arrays.equals(a, b));

        System.out.println("数组b的元素分别是：" + Arrays.toString(b));

        //将数组b的第3(包括)-5(不包括)个元素赋值为1
        Arrays.fill(b, 2, 4, 1);

        System.out.println("修改后数组b的元素分别是：" + Arrays.toString(b));
        //对数组b进行排序
        Arrays.sort(b);
        System.out.println("排序后数组b的元素分别是：" + Arrays.toString(b));
    }
}
