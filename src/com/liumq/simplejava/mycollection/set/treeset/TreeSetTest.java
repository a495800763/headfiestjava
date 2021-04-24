package com.liumq.simplejava.mycollection.set.treeset;

import java.util.TreeSet;

/**
 * treesettest
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        //向treeset中添加四个Integer对象
        nums.add(5);
        nums.add(2);
        nums.add(10);
        nums.add(-9);

        //输出集合中的元素，可以看到已经呈现排序状态
        System.out.println(nums);
        //输出集合里面的第一个元素
        System.out.println(nums.first());
        //输出集合里面的最后一个元素
        System.out.println(nums.last());
        //返回小于4的子集，不包含4
        System.out.println(nums.headSet(4));
        //返回大于5的子集，如果set中包含5.子集中应该仍包含5，即≥
        System.out.println(nums.tailSet(5));
        //返回[-3,4)的子集
        System.out.println(nums.subSet(-3, 4));
    }
}
