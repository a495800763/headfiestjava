package com.liumq.simplejava.div;

public class MultiExceptiionTest {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("您输入的两数相除的结果是：" + (c));
        }
        catch (IndexOutOfBoundsException|NumberFormatException|ArithmeticException ie)
        {
            System.out.println("程序发生了数组越界、数字格式异常、算术异常其中之一");
        }
        catch (Exception e)
        {

        }
    }
}
