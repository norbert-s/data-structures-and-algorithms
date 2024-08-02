package org.example.time_complexity;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3};
        int res = missingInteger(arr);
        System.out.println(res);
    }

    public static int missingInteger(int[] tomb){
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<tomb.length;i++){
            set.add(tomb[i]);
        }
        int i;
        for(i=1;i<=tomb.length;i++){
            if(!set.contains(i)) return i;
        }

        return i;
    }
}
