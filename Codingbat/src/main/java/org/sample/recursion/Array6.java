package org.sample.recursion;

public class Array6 {
    public static void main (String[]args){
        int tomb[] = {
                1, 9, 4, 6, 6
        };
        System.out.println(array6( tomb,0));
    }
    public static boolean array6(int[] nums, int i) {
        if(nums.length==0)return false;
        if(i==nums.length-1)
            return nums[i]==6;
        else if(nums[i]==6) return true;
        return array6(nums,i+1);
    }
//    array6([1, 6, 4], 0) → true	true	OK
//    array6([1, 4], 0) → false	false	OK
//    array6([6], 0) → true	true	OK
//    array6([], 0) → false	false	OK
//    array6([6, 2, 2], 0) → true	true	OK
//    array6([2, 5], 0) → false	false	OK
//    array6([1, 9, 4, 6, 6], 0) → true	true	OK
//    array6([2, 5, 6], 0) → true	true	OK
}
