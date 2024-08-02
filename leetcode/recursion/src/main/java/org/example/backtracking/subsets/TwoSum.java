package org.example.backtracking.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class TwoSum {
    public static void main(String[]args){
        int [] nums = {2,7,11,15};
        int target = 9;

        Arrays.sort(nums);
        int [] res = twoSum(nums,target);
        Arrays.stream(res).forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target) {

        int i;
        int j=1;
        boolean found = false;
        int[] tomb = new int[2];
        for(i=0;i<nums.length-1;i++){
            if (found) break;

            for (j=i+1;j<nums.length;j++){
                int maradek = target -nums[i];
                if(nums[j]==maradek){
                    tomb[0]=i;
                    tomb[1]=j;
                    found = true;
                    break;
                }
            }

        }
        return tomb;

    }

    //suppose its sorted
    public static int[] twoSum2(int[] nums, int target) {
        int i;
        int index=-1;
        for(i=0;i<nums.length;i++){
           int maradek = target -nums[i];
           index =binarySearch(nums,i+1,nums.length,maradek);
           if (index>=0){
               break;
           }
        }
        return new int[] {i,index};

    }

    static int binarySearch(int nums[],int start, int end,int target){
        if(start>=end){
            return -1;
        }

        int mid = (start+end)/2;

        if(nums[mid]==target) return mid;
        else if (target<nums[mid]) {
            return binarySearch(nums,start,mid,target);
        }else{
            return binarySearch(nums,mid+1,end,target);
        }

    }
}
