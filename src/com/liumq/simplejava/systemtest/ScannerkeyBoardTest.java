package com.liumq.simplejava.systemtest;

import java.util.Scanner;

public class ScannerkeyBoardTest {
    public static void main(String[] args) {
        //标准输入，也就是键盘输入
        Scanner scanner = new Scanner(System.in);
        //只将回车作为分割符
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            System.out.println("键盘的输入内容是" + scanner.next());
        }
    }
}
