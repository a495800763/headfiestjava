package com.liumq.simplejava.progress;

public class ForTest {
    public static void main(String[] args) {
        forInsteadWhile();
    }

    private static void simpleFor() {
        for (int count = 0; count < 10; count++) {
            System.out.println(count);
        }
    }

    private static void complexFor() {
        for (int b = 0, s = 0, p = 0;
             b < 10 && s < 4 && p < 10; p++) {
            System.out.println(b++);
            System.out.println(++s + p);
        }
    }

    private static void errorFor() {
        for (int count = 0; count < 10; count++) {
            System.out.println(count);
            //再次改变了循环变量
            count *= 0.1;
        }
    }

    private static void deadFor() {
        for (; ; ) {
            System.out.println("死循环哦");
        }
    }

    private static void forInsteadWhile() {
        //把for循环的初始条件提出来独立定义
        int count = 0;
        //for循环里只写循环条件
        for (; count < 10; ) {
            System.out.println(count);
            //把循环迭代部分放在循环体的最后定义
            count++;
        }
        System.out.println("循环结束");
    }

}
