package com.liumq.simplejava.mycollection.queue;

import java.util.ArrayDeque;

/**
 * 使用ArrayDeque来实现栈Stack
 * 在需要使用栈这种结构时，尽量使用ArratDeque 而不要使用实现Vector接口的Stack类
 * Stack类太过古老而性能较差
 */
public class ArrayDequeStack {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        //依次将三个元素放入栈中
        stack.push("数学");
        stack.push("物理");
        stack.push("化学");

        System.out.println(stack);

        //访问栈顶元素但是并不将其pop出栈
        System.out.println(stack.peek());
        //stack 中依然是三个元素
        System.out.println(stack);
        //pop出第一个元素
        System.out.println(stack.pop());
        //栈中只剩两个元素了
        System.out.println(stack);
    }
}
