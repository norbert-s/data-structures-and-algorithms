package org.sample.array1;

public class MaxEnd3 {
    public int[] maxEnd3(int[] nums) {
        int szam = greater(nums);
        nums[1]=szam;
        nums[2]=szam;
        nums[0]=szam;
        return nums;
    }

    public int greater(int [] nums){
        if(nums[0]>nums[2]){
            return nums[0];
        }
        return nums[2];
    }

}
