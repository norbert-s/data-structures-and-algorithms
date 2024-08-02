package org.example;


import org.example.hashmap.MyHashMap;

public class App {
    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        System.out.println(hashMap.list ==null);
        System.out.println(hashMap.list.size());
//        hashMap.put(1,13);
//        hashMap.put(10,13);
//        hashMap.put(20,27);
//        System.out.println(hashMap.get(20));
//        System.out.println(hashMap.get(10));
//        hashMap.remove(20);
//        System.out.println("itt "+hashMap.get(20));
//
//        hashMap.put(0,333);
//        System.out.println(hashMap.get(0));
        hashMap.put(0,444);
        System.out.println(hashMap.get(0));
        hashMap.put(100,222);
        System.out.println(hashMap.get(100));
    }
}
