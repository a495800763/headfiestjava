package com.liumq.simplejava.array;

public class PrimitiveArrayTest {
    public static void main(String[] args) {
        //定义一个int[]类型的数组变量
        int[] iArr;
        //动态初始化数组，长度是5
        iArr = new int[5];
        //采用循环方式为数组每个元素赋值
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = i + 10;
        }
    }
}
