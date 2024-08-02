package org.example.medium;

import java.util.Arrays;
import java.util.Optional;

public class MinSubarrayLen {
    public static void main(String[] args) {
        MinSubarrayLen minSubarrayLen = new MinSubarrayLen();
        int nums [] = {2,3,1,2,4,3};
        System.out.println(minSubarrayLen.minSubArrayLen(7,nums));
    }


    //accepted
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            while (sum >= target){
                min = Math.min(min, i-k+1);
                sum -= nums[k++];
            }
        }
        if(min==Integer.MAX_VALUE)return 0;
        else return min;

    }

    //brute force time limit exceeded
    public int minSubArrayLen2(int target, int[] nums) {
        int min =Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum =0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum>=target){
                    min = Math.min(min,j-i+1);
                    break;
                }
            }
        }
        if(min==Integer.MAX_VALUE)return 0;
        else return min;
    }
}
