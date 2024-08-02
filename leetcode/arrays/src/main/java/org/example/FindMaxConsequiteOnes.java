package org.example;

public class FindMaxConsequiteOnes {
    public static void main(String[] args) {
        int [] arr = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) {
                counter++;
                if(counter>max) max=counter;
            }
            else counter =0;
        }
        return max;
    }
}
