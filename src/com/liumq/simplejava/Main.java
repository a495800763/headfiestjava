package com.liumq.simplejava;

/**
 * Description:
 * website:<a href="http://www.baidu.com">liumq</a><br>
 * Copyright(C),2001-2021 , LiuMengqi<br>
 *
 * @author liumq
 * @version 1.9
 */
public class Main {

    private static int _$1 = 100;

    //0开头表示八进制数
    private static int octalValue = 013;

    //0x开头表示十六进制数
    private static int hexValue = 0x13;

    //0b开头表示而进制数
    private static int binValue = 0b11010100;


    public static void main(String[] args) {
        System.out.println("十进制数：" + _$1);
        System.out.println("八进制数：" + octalValue);
        System.out.println("十六进制数：" + hexValue);
        System.out.println("二进制数：" + binValue);
        System.out.println("hello world");
    }
}
