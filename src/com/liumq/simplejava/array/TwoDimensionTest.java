package com.liumq.simplejava.array;

/**
 * 二维数组（嵌套的一维数组罢了）
 */
public class TwoDimensionTest {
    public static void main(String[] args) {
        //定义一个二维数组
        int[][] a;
        //把a 当成一个一维数组进行初始化，初始化a是一个长度为4的数组
        //而a数组的数组元素又是引用类型的数组
        a = new int[4][];

        System.out.println("a数组本身有如下几个元素");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //初始化a数组的第一个元素
        a[0] = new int[2];
        //访问a数组的第一个元素所指的数组的第二个元素
        a[0][1] = 6;
        System.out.println("a数组的第一个元素是一个数组，其有如下几个元素");
        for (int j = 0; j < a[0].length; j++) {
            System.out.println(a[0][j]);
        }
    }
}
