package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int [] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        removeDuplicates(arr);
        Arrays.stream(arr).forEach(System.out::println);
        //saveUniques(arr);
    }
    static void saveUniques(int [] nums){
        List<Integer> list = new ArrayList<>();
        int i;
        for(i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                list.add(nums[i]);
            }
        }

        list.forEach(System.out::println);
    }

    public static void removeDuplicates(int[] nums) {
        int k=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
    }

    public int RemoveDuplicates(int[] nums)
    {
        int i=0,j=1;
        while(j<nums.length)
        {
            if(nums[j++]!=nums[i])
                nums[++i] =nums[j-1];
        }
        return i+1;
    }
}

