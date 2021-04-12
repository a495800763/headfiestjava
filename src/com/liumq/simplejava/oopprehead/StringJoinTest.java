package com.liumq.simplejava.oopprehead;

/**
 * 宏变量的替换导致指向内存中的同一块地址
 */
public class StringJoinTest {
    public static void main(String[] args) {
        String s1 = "疯狂java";
        //s2变量引用的字符串可以在编译时就确定下来，因此s2是一个宏变量，与常量池中已有的宏变量s1 直接相等
        String s2 = "疯狂" + "java";

        System.out.println(s1 == s2);

        String str1 = "疯狂";
        String str2 = "java";

        //s3 由两个普通变量执行运算得来，编译器不会将之与常量池中的量进行宏替换
        // 因此s3与s1指向不同的地址
        String s3 = str1 + str2;
        System.out.println(s1 == s3);


        final String str3 = "疯狂";
        final String str4 = "java";
        //使用final修饰变量后，可以启用宏替换，即可使编译器在编译时确定s4的值  与s1 指向同一地址
        String s4 = str3 + str4;
        System.out.println(s1 == s4);
    }
}
