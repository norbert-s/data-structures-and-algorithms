package org.example.dynamic_programming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args){
        LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();
        int nums [] = {0,1,0,3,2,3};
        longestIncreasingSubsequence.lengthOfLIS(nums);
    }

    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int longest = 1;
        for(int i = 1; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            longest = Math.max(longest, dp[i]);
        }
        return longest;

    }
}
