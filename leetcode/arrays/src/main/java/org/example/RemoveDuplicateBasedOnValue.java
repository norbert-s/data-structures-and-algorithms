package org.example;

import java.util.Arrays;

public class RemoveDuplicateBasedOnValue {
    public static void main(String[] args) {
        int [] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

    }

    int removeElement(int [] nums, int val) {
        int counter = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                counter++;
                int j=i;
                while(j<nums.length-1){
                    nums[j]=nums[j+1];
                    j++;
                }
                nums[j]=-1;
                i--;
            }
        }
        return nums.length-counter;
    }
}
