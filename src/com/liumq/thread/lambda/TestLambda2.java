package com.liumq.thread.lambda;

/**
 * 推导带参数的lambda表达式
 */
public class TestLambda2 {

    static class Love implements ILove {
        @Override
        public void love(int a) {
            System.out.println("i love you 1 : " + a);
        }
    }


    public static void main(String[] args) {
//        ILove love = new Love();
//        love.love(2);
//
//        ILove love = new ILove() {
//            @Override
//            public void love(int a) {
//                System.out.println("i love you 1 : " + a);
//            }
//        };

        ILove love = a -> {
            System.out.println("i love you 1 : " + a);
        };

        // 总结：前提 接口是函数式接口
        // 多个参数，可以去掉参数类型
        // 只有一个参数 ，可以简化 参数的  （）
        // 只有一行代码，可以简化表达式的 {}
        love.love(531);
    }
}


interface ILove {
    void love(int a);
}

class Love implements ILove {
    @Override
    public void love(int a) {
        System.out.println("i love you 1 : " + a);
    }
}