package org.sample.array2;

public class FizzArray3 {
    public int[] fizzArray3(int start, int end) {
        int[] tomb = new int[end - start];
        int counter = start;
        for (int i = 0; i < end - start; i++) {
            tomb[i] = counter;
            counter++;
        }
        return tomb;
    }


}
