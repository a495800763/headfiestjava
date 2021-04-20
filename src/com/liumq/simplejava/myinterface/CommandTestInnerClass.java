package com.liumq.simplejava.myinterface;

public class CommandTestInnerClass {
    public static void main(String[] args) {
        ProgressArray pa = new ProgressArray();
        int[] target = {3, -4, 6, 4};
        pa.progress(target, new Command() {
            @Override
            public void progress(int element) {
                System.out.println("数组元素的平方是：" + Math.pow(element, 2));
            }
        });
    }
}
