package org.example.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class KthLargestElement {
    public static void main(String[] args) {
        KthLargestElement kthLargestElement = new KthLargestElement();
        int nums [] = {3,2,3,1,2,4,5,5,6};
        System.out.println(kthLargestElement.findKthLargest(nums,4));
    }

    public int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0 && k>=1;i--){
            if(k==1)return (int) arr[i];
            k--;
        }
        return -1;
    }
}
