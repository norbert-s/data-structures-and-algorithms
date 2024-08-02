package org.sample.array2;

public class FizzArray {
    public int[] fizzArray(int n) {
        int size = n;
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }

}
