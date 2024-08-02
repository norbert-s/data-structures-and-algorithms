package org.example.sorting;

import java.util.HashSet;
import java.util.Set;

public class AbsDistinct {
    public static void main (String [] args){
        int [] tomb = { -4,-2,0, 2,5};
    }
    public static int absDistinct(int[]tomb){
        Set<Integer> myMap = new HashSet<>();
        if(tomb.length==1) return 1;
        else{
            for(int i=0;i<tomb.length;i++){
                myMap.add(Math.abs(tomb[i]));
            }
        }
        return myMap.size();
    }
}
