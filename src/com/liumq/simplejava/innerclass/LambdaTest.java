package com.liumq.simplejava.innerclass;

public class LambdaTest {
    public static void main(String[] args) {
        Object obj = (Runnable) () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
            }
        };
    }
}
