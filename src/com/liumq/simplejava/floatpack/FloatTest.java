package com.liumq.simplejava.floatpack;

public class FloatTest {

    public static void main(String[] args) {
        float af = 5.2345556f;
        //打印出来时 af 的值已经发生改变
        System.out.println(af);

        double a = 0.0;

        double c = Double.NEGATIVE_INFINITY;
        float d = Float.NEGATIVE_INFINITY;

        int e = 1_2_3_4;

        //double 和 float 的无穷大是相等的
        System.out.println(c == d);
        //0.0/0.0将出现非数
        System.out.println(a / a);
        //两个非数之间是不相等的
        System.out.println(a / a == Float.NaN);
        //所有正无穷大都是相等的
        System.out.println(6.0 / 0 == 555.5 / 0);
        //负数除以0.0得到负无穷大
        System.out.println(-8 / a);
        //数字中有下划线不影响值，用于划分位数
        System.out.println(e);
        //下面代码将抛出 除以0 的异常
        System.out.println(0 / 0);
    }
}
