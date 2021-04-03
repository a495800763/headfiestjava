package com.liumq.simplejava.progress;

public class doWhileTest {
    public static void main(String[] args) {
        function2();
    }

    private static void odWhiteTest() {
        //定义变量count
        int count = 1;
        do {
            System.out.println("count:" + count);
            //循环迭代语句
            count++;
        }
        //循环条件紧跟while 关键字
        while (count < 10);

        System.out.println("循环结束了");
    }

    public static void function2() {
        int count  = 20;
        do{
            System.out.println(count++);
        }while (count<10);
        System.out.println("循环结束了");
    }

}
