package org.example.counting_elements;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {
    public static void main(String[] args) {
        int [] arr = {4,1,3,2};
        int res = permCheck(arr);
        System.out.println(res);
    }

    public static int permCheck( int[] tomb){
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<tomb.length;i++){
            set.add(tomb[i]);
        }

        for(int i=0;i<tomb.length;i++){
            if(!set.contains(i+1)) return 0;
        }

        return 1;
    }
}
