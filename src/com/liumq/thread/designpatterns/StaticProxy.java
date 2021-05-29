package com.liumq.thread.designpatterns;

/**
 * 静态代理模式
 * 总结：
 * 真实对象和代理对象都要实现同一个接口
 * 代理对象要代理真实角色
 *
 *优点：
 * 代理对象可以做很多真实对象做不到的功能
 * 真实对象专注完成一个目标
 */
public class StaticProxy {

    public static void main(String[] args) {

        //线程通过实现runnable接口的对象来构造 其实也是一种代理模式
        new Thread( ()-> System.out.println("I Love You")).start();

        You you = new You();
        WeddingCompany wc = new WeddingCompany(you);
        wc.happyMarry();
    }
}


interface Marry {
    //结婚
    void happyMarry();
}


/**
 * 结婚 功能的真实角色
 */
class You implements Marry {
    @Override
    public void happyMarry() {
        System.out.println("我要结婚了  超开心!!!!");
    }
}

/**
 * 结婚功能的 代理角色，帮助 You 结婚
 */
class WeddingCompany implements Marry {


    /**
     * 真实目标作为参数传递
     */
    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void happyMarry() {
        //代理类在真实执行具体方法前后可以做其他操作
        before();
        //代理的目标结婚才是真正的函数调用
        this.target.happyMarry();
        after();
    }

    private void after() {
        System.out.println("结婚之后 结尾款");
    }

    private void before() {
        System.out.println("结婚之前 布置现场");
    }
}
