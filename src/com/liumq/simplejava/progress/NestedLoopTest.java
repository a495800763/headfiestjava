package com.liumq.simplejava.progress;

/**
 * 嵌套循环
 */
public class NestedLoopTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i的值是：" + i + "；j的值是：" + j);
            }
        }
    }
}
