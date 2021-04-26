package com.liumq.simplejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(-5);
        nums.add(3);
        nums.add(0);

        System.out.println(nums);

        //次序翻转
        Collections.reverse(nums);
        System.out.println(nums);
        //排序
        Collections.sort(nums);
        System.out.println(nums);
        //随机排序
        Collections.shuffle(nums);
        System.out.println(nums);
    }
}
