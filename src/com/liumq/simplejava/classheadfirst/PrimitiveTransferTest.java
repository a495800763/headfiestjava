package com.liumq.simplejava.classheadfirst;

/**
 * 参数值传递的测试方法
 */
public class PrimitiveTransferTest {
    public static void swap(int a, int b) {
        //下面三行代码实现a b值得交换
        int temp = a;
        a = b;
        b = temp;
        System.out.println("在swap方法执行完毕之后，方法中a的值是：" + a + " ；b的值是：" + b);
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        swap(a,b);
        System.out.println("将ab传递进swap方法交换完成后，a的值是：" + a + " ；b的值是：" + b);
    }
}
