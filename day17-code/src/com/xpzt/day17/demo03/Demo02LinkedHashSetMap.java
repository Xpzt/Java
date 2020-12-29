package com.xpzt.day17.demo03;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
 * java.util.LinkedHashMap<K,V> extends hashMap<K,V>
 * Map接口的哈希表和链接列表实现，具有可预知的迭代顺序
 * 底层原理：
 *   哈希表+链表（记录元素的顺序）
 * */
public class Demo02LinkedHashSetMap {
    public static void main(String[] args) {
        //创建HashMap对象
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("c", "c");
        map.put("b", "b");
        map.put("a", "d");
        System.out.println(map);//key不允许重复 无序

        //创建LinkedHashMap对象
        LinkedHashMap<String, String> linked = new LinkedHashMap<>();
        linked.put("a", "a");
        linked.put("c", "c");
        linked.put("b", "b");
        linked.put("a", "d");
        System.out.println(linked);//key不允许重复 有序

    }

}
