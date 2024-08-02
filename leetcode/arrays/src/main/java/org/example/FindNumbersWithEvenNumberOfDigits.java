package org.example;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int [] arr = {1000,23457677,222,22134,232};
        System.out.println(findNumbers(arr,0,0));
    }

    public static int findNumbers(int[] nums,int max,int index) {
        if(index==nums.length) return max;
        int digits = (int)Math.log10(nums[index])+1;
        if(digits%2==0){
            max++;
        }

        return findNumbers(nums,max,index+1);
    }
}
