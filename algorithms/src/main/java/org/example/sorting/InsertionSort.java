package org.example.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 9};
        //System.out.println(Arrays.toString(improvedInsertionSort(arr)));
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    static int[] insertionSort(int[] x) {
        for (int i = 1; i < x.length; i++) {
            int j = i - 1;
            while (j >= 0 && x[j] > x[j + 1]) {
                int temp = x[j];
                x[j] = x[j + 1];
                x[j + 1] = temp;
                j--;
            }
        }
        return x;
    }

    static int[] improvedInsertionSort(int[] x) {
        for (int i = 1; i < x.length; i++) {
            int j = i - 1;
            int temp = x[i];
            while (j >= 0 && x[j] > temp) {
                x[j + 1] = x[j];
                j--;
            }
            x[j + 1] = temp;
        }
        return x;
    }
}
