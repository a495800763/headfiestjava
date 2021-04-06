package com.liumq.simplejava.classheadfirst;

public class OverLoadVarargs {
    public void test(String msg) {
        System.out.println("只有一个字符串参数的test方法，参数是：" + msg);
    }

    public void test(String... msg) {
        System.out.println("参数个数可变的test方法");
        if (msg.length == 0) {
            System.out.println("可变参数的长度是0");
        } else {
            for (String s : msg) {
                System.out.print(s + " ");
            }

        }
    }

    public static void main(String[] args) {
        OverLoadVarargs overLoadVarargs = new OverLoadVarargs();
        //可变个数参数可以为0 个
        overLoadVarargs.test();
        overLoadVarargs.test("aa");
        overLoadVarargs.test(new String[]{"aa", "bb", "cc"});
    }

}
