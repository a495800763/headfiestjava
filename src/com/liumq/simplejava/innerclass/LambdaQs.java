package com.liumq.simplejava.innerclass;

interface Eatable {
    void taste();
}

interface Flyable {
    void fly(String weather);
}

interface Addable {
    int add(int a, int b);
}

public class LambdaQs {
    //调用该方法需要Eatable对象
    public void eat(Eatable e) {
        System.out.println(e);
        e.taste();
    }

    //调用该方法需要Flyable对象
    public void drive(Flyable f) {
        System.out.println("我正在驾驶：" + f);
        f.fly("[碧空如洗的晴天]");
    }

    //调用该方法需要Addable对象
    public void test(Addable a) {
        System.out.println("5和3的和是：" + a.add(5, 3));
    }

    public static void main(String[] args) {
        LambdaQs lq = new LambdaQs();
        //lambda表达式的代码块只有一句话时可以省略花括号
        lq.eat(() -> System.out.println("苹果的味道还不错"));
        //lambda表达式的形参列表只有一个形参时，可以省略圆括号
        lq.drive(weather -> {
            System.out.println("今天的天气是：" + weather);
            System.out.println("我柳梦琦就是牛");
        });
        //lambda代码块中只有一条语句，即使表达式需要返回值，也可以省略
        lq.test((a, b) ->
                a + b
        );
    }

}
