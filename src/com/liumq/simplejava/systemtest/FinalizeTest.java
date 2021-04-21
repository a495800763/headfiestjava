package com.liumq.simplejava.systemtest;

import com.liumq.simplejava.oopprehead.FinalErrorTest;

public class FinalizeTest {
    private static FinalizeTest ft = null;

    public void info() {
        System.out.println("测试清理资源的finalize方法******");
    }

    public static void main(String[] args) {
        //创建对象即可进入恢复状态
        new FinalErrorTest();
        //通知系统进行资源回收
        System.gc();
        //强制垃圾回收机制调用可恢复对象的finalize()方法
        System.runFinalization();
         ft.info();
    }

    @Override
    protected void finalize() throws Throwable {
        ft = this;
    }
}
