package com.liumq.simplejava.progress;

public class BreakTest {
    public static void main(String[] args) {
        breakLabel();
    }

    private static void simpleBreak() {
        for (int i = 0; i <= 20; i++) {
            System.out.println("i的值是:" + i);
            if (i == 13) {
                break;
            }
        }
    }

    private static void breakLabel() {
        outer:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i的值是：" + i + "；j的值是：" + j);
                if (j == 1) {
                    break outer;
                }
            }
        }
    }

}
