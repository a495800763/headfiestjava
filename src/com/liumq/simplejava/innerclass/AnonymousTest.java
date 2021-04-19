package com.liumq.simplejava.innerclass;

/**
 * 匿名内部类初步
 */
public class AnonymousTest {
    public void test(Product p) {
        System.out.println("购买一个" + p.getName() + ",花掉了：" + p.getPrice());
    }

    public static void main(String[] args) {
        AnonymousTest at = new AnonymousTest();
        at.test(new Product() {
            @Override
            public double getPrice() {
                return 15;
            }

            @Override
            public String getName() {
                return "匿名类测试工具";
            }
        });
    }
}

interface Product {
    double getPrice();

    String getName();
}
