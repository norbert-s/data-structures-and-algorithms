package org.sample.array1;

public class FirstLast6 {
    public boolean firstLast6(int[] nums) {
        int length = nums.length;
        if(length ==1 && nums[0]==6){
            return true;
        }
        else if(nums[0]==6 || nums[length-1]==6){
            return true;
        }
        return false;
    }
}
