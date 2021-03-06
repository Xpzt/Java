package com.xpzt.day17.demo02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map集合的第一种遍历方式：通过键找值的方法
 * Map集合中的方法：
 *       Set<K> keySet() 返回此映射中包含的键的Set视图
 * 实验步骤：
 *       1.使用Map集合中的方法keySet(),把Map集合所有的key取出来，存储到一个Set集合中
 *       2.遍历set集合，获取Map集合中的每一个key
 *       3.通过Map集合中的方法get(key),通过key找到value
 * */
public class Demo02KeySet {

    public static void main(String[] args) {
        //创建Map集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("陈浩", 11);
        map.put("陈bb", 1);
        map.put("cc", 11);
        // 1.使用Map集合中的方法keySet(),把Map集合所有的key取出来，存储到一个Set集合中
        Set<String> set = map.keySet();
        //2.遍历set集合，获取Map集合中的每一个key
        //使用迭代器
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            //3.通过Map集合中的方法get(key),通过key找到value
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("=========");
        //使用增强for循环
        for(String key:/*set*/map.keySet()){
            //3.通过Map集合中的方法get(key),通过key找到value
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }

}
