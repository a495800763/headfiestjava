package com.liumq.simplejava.array;

/**
 * 练习题
 */
public class Practice {
    public static void main(String[] args) {
        printMultiplicationTable();
    }

    /**
     * 打印九九乘法表
     */
    private static void printMultiplicationTable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                int mul = i * j;
                System.out.print(i + "×" + j + "=" + mul);
                if(i!=j)
                {
                    System.out.print(",");
                }
            }
            System.out.print("\n");
        }
    }
}
