package org.example.two_sum;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
       int [] arr = {3,2,4};
       int target = 7;
       Arrays.stream(twoSumQuadratic(arr,target)).forEach(System.out::println);

    }

    //mine correct
    public static int[] twoSumQuadratic(int[] nums, int target) {

        int i;
        int j=1;
        boolean found = false;
        int[] tomb = new int[2];
        for(i=0;i<nums.length-1;i++){
            if (found) break;

            for (j=i+1;j<nums.length;j++){
                int maradek = target -nums[i];
                if(nums[j]==maradek){
                    tomb[0]=i;
                    tomb[1]=j;
                    found = true;
                    break;
                }
            }

        }
        return tomb;

    }

}
