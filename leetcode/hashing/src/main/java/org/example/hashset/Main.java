package org.example.hashset;

public class Main {
    public static void main(String[] args) {
        HashSetImpl hashSet = new HashSetImpl();
        hashSet.add(1);
        hashSet.add(2);
        System.out.println(hashSet.contains(1));
        hashSet.remove(2);
        System.out.println(hashSet.contains(2));
    }
}
