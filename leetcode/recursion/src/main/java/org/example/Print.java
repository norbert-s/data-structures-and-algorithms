package org.example;

import java.util.ArrayList;
import java.util.List;

public class Print {
    public static void main(String []args){
        print(10);
        System.out.println(list);
    }

    static List<Integer> list = new ArrayList<>();
    static void print(int num){
        if(num==0){
            list.add(num);
            return;
        }
        list.add(num);
        print(num-1);
        //list.add(num);
    }
}
