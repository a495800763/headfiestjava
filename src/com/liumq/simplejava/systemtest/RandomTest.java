package com.liumq.simplejava.systemtest;

import java.util.Arrays;
import java.util.Random;

/**
 * 随机数类测试
 */
public class RandomTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(getRandomStr());
        }
    }

    private static final Integer strLength = 8;

    private static String getRandomStr() {
        String result = "";
        long seed = System.currentTimeMillis();
        System.out.println(seed+":");
        Random ra = new Random(seed);
        for (int i = 0; i < strLength; i++) {
            char a = (char) (ra.nextInt(26) + 65);
            result += a;
        }
        return result.toLowerCase();
    }

    private static void randomTestNew() {
        Random rand = new Random();
        System.out.println("rand.nextBoolean():" + rand.nextBoolean());
        byte[] buffer = new byte[16];
        rand.nextBytes(buffer);
        System.out.println(Arrays.toString(buffer));
        //生成0.1~1.0之间的伪随机double类型数
        System.out.println("rand.nextDouble():" + rand.nextDouble());
        //生成0.1~1.0之间的伪随机float类型数
        System.out.println("rand.nextFloat():" + rand.nextFloat());
        //生成平均值是0.0，标准差是1.0 的伪高斯数
        System.out.println("rand.nextGaussian():" + rand.nextGaussian());
        //生成一个处于int 整数取值范围内的伪随机整数
        System.out.println("rand.nextInt():" + rand.nextInt());
        //生成一个0~26之间的伪随机整数
        System.out.println("rand.nextInt(26):" + rand.nextInt(26));
        //生成一个处于long整数取值范围内的伪随机整数
        System.out.println("rand.nextLong(26):" + rand.nextLong());
    }
}
