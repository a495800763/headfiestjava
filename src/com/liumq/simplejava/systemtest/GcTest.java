package com.liumq.simplejava.systemtest;

public class GcTest {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            new GcTest();
            Runtime.getRuntime().gc();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("系统正在清理对象的资源");
    }
}
