package org.example;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 3, 0, 0, 0};
//
//        int[] nums2 = {2, 5, 6};
//
//        int m = 3;
//        int n = 3;

        int[] nums1 = {0};

        int[] nums2 = {1};

        int m = 0;
        int n = 1;
        merge(nums1, m, nums2, n);
        Arrays.stream(nums1).forEach(System.out::println);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = m - 1;
        int secondLast = n - 1;
        for (int i=nums1.length-1;i>=0;i--) {
            if (first>=0 && secondLast >=0) {
                if(nums1[first]>nums2[secondLast]){
                    nums1[i] = nums1[first--];
                }else{
                    nums1[i]=nums2[secondLast--];
                }
            } else if (first>=0) {
                nums1[i] = nums1[first--];

            } else  {
                nums1[i] = nums2[secondLast--];

            }
        }
    }
}
