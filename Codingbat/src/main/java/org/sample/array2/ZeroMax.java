package org.sample.array2;

import java.util.Arrays;

public class ZeroMax {

    public static void main(String[] args) {
        int arr[] = {0, 5, 0, 3};
        Arrays.stream(zeroMax(arr)).forEach(System.out::println);
    }

    //https://codingbat.com/prob/p187050
    public static int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                int j = i + 1;
                int max = -1;
                int index = -1;
                boolean shouldSwap = false;
                while (j < nums.length) {
                    if (nums[j] % 2 == 1 && nums[j] > max) {
                        max = nums[j];
                        index = j;
                        shouldSwap = true;
                    }
                    j++;
                }
                if (shouldSwap) {
                    int temp = nums[index];
                    nums[i] = nums[index];
                    nums[index] = temp;
                }
            }
        }
        return nums;
    }
}
