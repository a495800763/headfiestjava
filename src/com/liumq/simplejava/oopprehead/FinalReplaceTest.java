package com.liumq.simplejava.oopprehead;

/**
 * 宏变量test
 *
 */
public class FinalReplaceTest {
    public static void main(String[] args) {
        //下面定义了四个final“宏变量”
        final int a = 5 + 2;
        final double b = 1.2 / 3;
        final String c = "疯狂" + "java";
        final String book1 = "疯狂java讲义：" + 99.0;

        //下面的book2变量因为调用了方法，无法在编译时确认其值，因此是与book1 不是同一个内存地址
        final String book2 = "疯狂java讲义：" + String.valueOf(99.0);
        String origin = "疯狂java讲义：99.0";

        //book1是一个宏变量 book2 不是一个宏变量
        System.out.println(book1 == origin);
        System.out.println(book2 == origin);

    }
}
