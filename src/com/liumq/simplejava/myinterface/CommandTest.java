package com.liumq.simplejava.myinterface;

interface Command {
    //接口里定义progress方法用于封装"处理行为"
    void progress(int element);
}

class ProgressArray {
    public void progress(int[] targer, Command command) {
        for (int i : targer) {
            command.progress(i);
        }

    }

}

class printCommand implements Command {
    @Override
    public void progress(int element) {
        System.out.println("迭代输出目标数组的元素 :" + element);
    }
}

class squareCommand implements Command {
    @Override
    public void progress(int element) {
        System.out.println("数组元素的平方 :" + (element * element));
    }
}

public class CommandTest {
    public static void main(String[] args) {
        ProgressArray pa = new ProgressArray();
        int[] target = {3, -4, 6, 4};
        pa.progress(target, new printCommand());
        System.out.println("--------------------");
        pa.progress(target, new squareCommand());
    }
}
