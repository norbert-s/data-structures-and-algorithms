package org.example.dynamic_programming;

import java.util.Arrays;

public class StairCaseProblem {
    public static void main(String[] args) {
        StairCaseProblem stairCaseProblem=new StairCaseProblem();
        int nth = 5;

        System.out.println(stairCaseProblem.climbStairs(nth));

    }
    int [] arr;
    public int climbStairs(int nth) {
        arr = new int[nth+1];
        Arrays.fill(arr,-1);
        return staircase(nth);
    }
    int staircase(int nth){
        if(nth==1)return 1;
        if(nth==2) return 2;
        if(arr[nth]!=-1){
            return arr[nth];
        }
        int result = staircase(nth-1)+staircase(nth-2);
        arr[nth] = result;
        return arr[nth];
    }
}
