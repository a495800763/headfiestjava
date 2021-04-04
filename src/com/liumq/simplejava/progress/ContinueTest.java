package com.liumq.simplejava.progress;

public class ContinueTest {

    public static void main(String[] args) {
        continueLabel();
    }

    private static void simpleContinue() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("i的值是：" + i);
            if (i == 4) {
                continue;
            }
            System.out.println("没被continue的时候会输出");
        }
    }

    private static void continueLabel() {
        outer:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i的值是：" + i + "；j的值是：" + j);
                if (j == 1) {
                    continue outer;
                }
            }
        }
    }
}
