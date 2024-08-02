package org.example.easy;

public class IsMonotonic {
    public boolean isMonotonic(int[] nums) {
        boolean inc = false;
        boolean dec = false;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                inc = true;
            }
            else if(nums[i]<nums[i-1]){
                dec = true;
            }
        }
        if(inc&&dec) return false;
        else return true;
    }
}
