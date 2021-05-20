package com.liumq.simplejava.div;

import java.io.FileInputStream;
import java.io.IOException;

public class AccessExceptionMsg {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("a.txt");
        } catch (IOException e) {
            System.out.println("错误的信息是：" + e.getMessage());
            e.printStackTrace();
        }
    }
}
