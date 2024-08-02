package org.sample.array1;

public class MakeEnds {
    public int[] makeEnds(int[] nums) {
        int[] nums2={0,0};

        nums2[0] = nums[0];
        nums2[1] = nums[nums.length-1];
        return nums2;
    }

}
