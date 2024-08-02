package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Integer> a = new LinkedList<Integer>();
        a.add(1);
        a.add(4);
        a.add(2);
        a.add(2);
        a.add(3);
        a.add(1);
        a.add(3);
        a.add(3);
        a.add(4);
        System.out.println(pickingNumbers(a));

    }

    public static int pickingNumbers(List<Integer> a){
        Set<Integer> b = new TreeSet<Integer>();

        for(int i=0;i<a.size()-1;i++){
            int count =0;
            for(int j=0;j<a.size();j++){
                if(a.get(i)+1==a.get(j) ||a.get(i)-1==a.get(j) || a.get(i)==a.get(j)){
                    count++;
                }
            }
            b.add(count);
        }
        int ez = ((TreeSet<Integer>) b).last();
        return ez;
    }
}
