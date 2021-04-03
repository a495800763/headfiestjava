package com.liumq.simplejava.opreation;

public class ComparableOperatorTest {
    public static void main(String[] args) {
        System.out.println("5是否大于4.0：" + (5 > 4.0));
        System.out.println("5与5.0 是否相等：" + (5 == 5.0));
        System.out.println("97 与 ‘a’是否相等：" + ('a' == 97));
        System.out.println("true与false 是否相等：" + (true == false));

        ComparableOperatorTest t1 = new ComparableOperatorTest();
        ComparableOperatorTest t2 = new ComparableOperatorTest();
        System.out.println("t1与t2是否相等：" + (t1 == t2));

        ComparableOperatorTest t3 = t1;
        System.out.println("t1与t3 是否相等：" + (t1 == t3));
    }
}
