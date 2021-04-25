package com.liumq.simplejava.map;

import java.rmi.MarshalledObject;
import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("疯狂java讲义", 109);
        map.put("疯狂ios讲义", 10);
        map.put("疯狂Ajax讲义", 79);
        //多次放入的k-v对中value 可以重复
        map.put("轻量级javaee企业应用实践", 99);

        //放入重复的key时，新的value会覆盖原有的value
        //如果新的value覆盖了原有的value，put方法返回被覆盖的value
        System.out.println(map.put("疯狂ios讲义", 99));
        System.out.println(map);

        //判断是否包含指定的key
        System.out.println("是否包含key值为'疯狂java讲义':" + map.containsKey("疯狂java讲义"));

        //判断是否包含指定的value
        System.out.println("是否包含value值为 99 ：" + map.containsValue(99));

        for (String key : map.keySet()) {
            System.out.println(key + "------>" + map.get(key));
        }

        map.remove("疯狂Ajax讲义");
        System.out.println(map);


    }
}
