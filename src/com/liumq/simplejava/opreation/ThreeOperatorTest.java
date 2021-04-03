package com.liumq.simplejava.opreation;

public class ThreeOperatorTest {

    public static void main(String[] args) {
        String str = 5 > 3 ? "5大于3" : "5小于3";
        System.out.println(str);
        System.out.println('\n');
        nestedThreeOperator();
    }

    /**
     * 嵌套的三目运算符
     */
    public static void nestedThreeOperator() {
        int a = 11;
        int b = 13;
        String str = a > b ? "a大于b" : (a < b ? "a小于b" : "a==b");

        System.out.println(str);

    }

}
