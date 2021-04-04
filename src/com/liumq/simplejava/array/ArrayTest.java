package com.liumq.simplejava.array;

public class ArrayTest {
    public static void main(String[] args) {
        arrayInRam();

    }

    /**
     * 数组的静态初始化
     */
    private static void arrayStaticInit() {
        int[] intArr;
        intArr = new int[]{5, 6, 8, 20};

        Object[] objArr;

        objArr = new String[]{"Liumengqi", "Wangqishan", "Xijinpin"};

        Object[] objArr2;

        objArr2 = new Object[]{"Wangzihao", 2};

        for (Object o : objArr2) {
            System.out.println("数组2 中的元素:" + o);
        }

    }

    public static void arrayTest() {
        String[] books = new String[4];
        books[0] = "疯狂java讲义";
        books[1] = "轻量级java企业应用实践";

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }

        System.out.println("下面使用foreach循环");
        System.out.println("\n");

        for (String book : books) {
            System.out.println(book);
        }
    }

    public static void arrayInRam() {
        int[] a = {5, 7, 20};
        int[] b = new int[4];
        System.out.println("数组b的长度是：" + b.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        b = a;

        System.out.println("此时b数组的长度是：" + b.length);
    }

}
