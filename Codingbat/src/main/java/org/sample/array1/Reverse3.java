package org.sample.array1;

public class Reverse3 {
    public int[] reverse3(int[] nums) {
        int length = nums.length;
        int [] reversed = new int [length];
        for(int i=0;i<length;i++){
            reversed[length-1-i]=nums[i];
        }
        return reversed;
    }

}
