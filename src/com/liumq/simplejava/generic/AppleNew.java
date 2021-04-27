package com.liumq.simplejava.generic;

public class AppleNew<T extends  Number> {
    T col;

    public static void main(String[] args) {
        AppleNew<Integer> appleNew = new AppleNew<>();
        AppleNew<Double> appleDouble = new AppleNew<>();

        //String 不是 Number 类型的子类型 新建失败
        //AppleNew<String> appleNew1 = new AppleNew<String>();
    }
}
