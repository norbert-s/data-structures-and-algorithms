package org.sample.recursion;

public class Array11 {

    public static void main (String[]args){
        System.out.println(array11(new int[]{1,2,11,3,11,5},0));

    }

    public static int array11(int[] nums,int index) {
        if(nums.length==0) return 0;
        if(index==nums.length-1){
            if(nums[index]==11) return 1;
            else return 0;
        }

        else if(nums[index]==11){
            return 1+array11(nums,index+1);
        }
        return array11(nums,index+1);
    }
}
//https://codingbat.com/prob/p135988
//array11([1, 2, 11], 0) → 1	1	OK
//array11([11, 11], 0) → 2	2	OK
//array11([1, 2, 3, 4], 0) → 0	0	OK
//array11([1, 11, 3, 11, 11], 0) → 3	3	OK
//array11([11], 0) → 1	1	OK
//array11([1], 0) → 0	0	OK
//array11([], 0) → 0	0	OK
//array11([11, 2, 3, 4, 11, 5], 0) → 2	2	OK
//array11([11, 5, 11], 0) → 2	2	OK