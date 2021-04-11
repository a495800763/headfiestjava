package com.liumq.simplejava.oopprehead;

public class StringCompareTest {
    public static void main(String[] args) {
        //s1直接引用常量池中的量
        String s1 = "疯狂java";
        String s2 = "疯狂";
        String s3 = "java";

        String s4 = "疯狂" + "java";

        String s5 = "疯" + "狂" + "java";

        String s6 = s2 + s3;

        String s7 = new String("疯狂java");

        System.out.println(s1==s4);
        System.out.println(s1==s5);
        System.out.println(s1==s6);
        System.out.println(s1==s7);
    }
}
