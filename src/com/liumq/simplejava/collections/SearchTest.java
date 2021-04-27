package com.liumq.simplejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchTest {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(-5);
        nums.add(3);
        nums.add(0);
        System.out.println(nums);

        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));

        //将nums中的0 用1 代替
        Collections.replaceAll(nums, 0, 1);

        //判断-5 在List集合中出现的次数，返回1
        System.out.println(Collections.frequency(nums, -5));
        //对集合排序
        Collections.sort(nums);

        System.out.println(nums);

        //只有排序后的list 可以用二分法查找。输出3
        System.out.println(Collections.binarySearch(nums, 3));
    }
}
