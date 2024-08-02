package com.company;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
        Set<Integer> nums =new TreeSet<Integer>();
        int max =0;
        int maxVal =0;

        for(int i=0;i<arr.length;i++){
            nums.add(arr[i]);
        }
        for(int i : nums){
            int countCurrent =0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]== i){
                    countCurrent++;
//                    maxVal = arr[j];
                }
            }
            if(countCurrent>max){
                max = countCurrent;
            }
        }
        int result = arr.length-max;
        return result;
    }
}
