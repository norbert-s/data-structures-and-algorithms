package org.example.prefix_sums;

import java.util.*;

public class PassingCars {
    public static void main(String[] args) {
        int [] arr = {0,1,0,1,1};
        int res = passingCars(arr);
        System.out.println(res);
    }

    public static int passingCars(int[] tomb){

        int sum = 0;
        int counterOne = 0;

        for(int i= tomb.length-1;i>=0;i--){
            if(tomb[i]==1) counterOne++;
            else{
                sum+=counterOne;
            }
        }
        if(sum>1000000000 || sum < -1000000000 ) return -1;
        return sum;
    }
}
