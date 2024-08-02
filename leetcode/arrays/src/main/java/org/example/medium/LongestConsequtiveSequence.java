package org.example.medium;

import java.util.Arrays;

public class LongestConsequtiveSequence {
    public static void main(String[] args) {
        int nums [] = {1,2,0,1};
        System.out.println(longestConsecutive(nums));
    }


    public static int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int max = 0;
        int counter=0;
        for(int i=1;i<nums.length;i++){
            if((nums[i]-1)==nums[i-1]){
                counter++;
                if(counter>max)max=counter;
            }
            else if(nums[i-1]==nums[i]){
                //we dont do anything in this case
            }
            else{
                counter=0;
            }
        }
        return max+1;

    }
}
