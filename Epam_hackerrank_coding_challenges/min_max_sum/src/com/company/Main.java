package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[]args){
        int [] a = {7, 69 ,2, 221 ,8974};
        miniMaxSum(a);
    }

    static void miniMaxSum(int[] arr) {
        ArrayList<Long> a = new ArrayList<Long>();
        for(int i=0;i<arr.length;i++){
            long sum =0;
            for(int j=0;j<arr.length;j++){
                if(j!=i){
                    sum+=arr[j];
                }
            }
            a.add(sum);
        }
        long min = a.get(0);
        long max = a.get(0);
        for(int i=0;i<a.size();i++){
            if(a.get(i)<min){
                min= a.get(i);
            }
            if(a.get(i)>max){
                max = a.get(i);
            }
        }

        System.out.println(min+" "+max);

    }
}
