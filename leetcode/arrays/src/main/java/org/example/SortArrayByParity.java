package org.example;

import java.util.Arrays;

public class SortArrayByParity {

    public static void main(String[] args) {
        int [] arr = {1,2};
        sortArrayByParity(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static int[] sortArrayByParity(int[] A) {
        int i = 0, j = A.length - 1;
        while (i < j) {
            if (A[i] % 2 > A[j] % 2) {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }

            if (A[i] % 2 == 0) i++;
            if (A[j] % 2 == 1) j--;
        }
        return A;
    }
}
