package com.liumq.simplejava.opreation;

/**
 * 逻辑操作符
 */
public class LogicOperatorTest {
    public static void main(String[] args) {
        System.out.println(!false);

        System.out.println(5 > 3 && '6' > 10);

        System.out.println(4 >= 5 || 'c' > 'a');

        //求异操作符^,左右相异时为true
        System.out.println(4 >= 5 ^ 'c' > 'a');

        function();

    }

    public static void function() {
        int a = 5;
        int b = 10;
        //不短路或，条件一满足 但是还是会计算条件二
        if (a > 4 | b++ > 10) {
            System.out.println("a =" + a + "; b=" + b);
        }

        int c = 5;
        int d = 10;
        // 短路或，条件一满足后不会计算条件二
        if (c > 4 || d++ > 10) {
            System.out.println("c =" + c + "; d=" + d);
        }
    }

}
