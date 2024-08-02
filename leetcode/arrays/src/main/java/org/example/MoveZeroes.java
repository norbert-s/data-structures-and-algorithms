package org.example;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int [] arr = {0,1,0};
        moveZeroes(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void moveZeroes(int[] nums) {
        int counter = 0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]==0) {
                counter++;
                int k=i;
                while(k< nums.length-1){
                    nums[k]=nums[k+1];
                    k++;
                }
            }
        }
        for(int j=nums.length-1;j>nums.length-counter;j--){
            nums[j]=0;
        }
    }
}
