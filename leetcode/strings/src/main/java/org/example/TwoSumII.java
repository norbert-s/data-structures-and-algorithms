package org.example;

public class TwoSumII {
    public static void main(String[] args) {
        //System.out.println(removeElement(new int[]{-1,0},-1));
        for (int i : twoSumII(new int[]{-1, 0}, -1)) {
            System.out.println(i);
        }
    }

    public static int[] twoSumII(int[] nums, int target) {

        int[] res = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                System.out.println("hi");
                if (nums[j] + nums[i] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }

        }
        return res;
    }
}

//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
//
//Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
//
//Return k after placing the final result in the first k slots of nums.
//
//Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.