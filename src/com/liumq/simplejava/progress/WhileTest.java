package com.liumq.simplejava.progress;

public class WhileTest {
    public static void main(String[] args) {
        errorFunction();
    }

    private static void functionOne() {
        //循环的初始条件
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            //迭代语句
            count++;
        }
        System.out.println("循环结束");
    }

    private static void funtionTwo() {
        int count = 0;
        while (count < 10) {
            System.out.println("不停执行的死循环：" + count);
            count--;
        }
        System.out.println("永远无法跳出循环体");
    }

    private static void errorFunction() {
        int count = 0;
        while (count < 10) ;
        {
            System.out.println("我以为循环在执行呢！！");
            count++;
        }
        System.out.println("我以为循环在这里执行完了");
    }

}
