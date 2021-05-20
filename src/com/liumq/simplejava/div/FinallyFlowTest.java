package com.liumq.simplejava.div;

import jdk.internal.org.objectweb.asm.tree.FieldInsnNode;

public class FinallyFlowTest {
    public static void main(String[] args) {
        boolean a = test();
        System.out.println(a);
    }

    private static boolean test() {
        try {
            //因为finally语句中包含了return语句，所以try中的原本的return 失去作用
            System.out.println("执行到了try中return的前一句");
            return true;
        } finally {
            return false;
        }
    }
}
