package org.example.counting_elements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public static void main(String[] args) {
        int [] arr = {1,3,1,4,2,3,5,4};
        int res = frogRiverOne(5,arr);
        System.out.println(res);
    }

    public static int frogRiverOne(int elvartMennyiseg, int[] tomb){
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<tomb.length;i++){
            set.add(tomb[i]);
            if(set.size()==elvartMennyiseg)return i;
        }

        return -1;
    }

    public static int frogRiver(int [] tomb,int  X){
        Set<Integer> mySet = new HashSet<>();
        for(int i=1;i<=X;i++){
            mySet.add(i);
        }
        for(int i=0;i< tomb.length;i++){
            if(mySet.contains(tomb[i])){
                mySet.remove(tomb[i]);
            }
            if(mySet.isEmpty()){
                return i;
            }
        }
        return -1;
    }
}
