package org.sample.array2;

public class FizzArray2 {
    public String[] fizzArray2(int n) {

        String[] x = new String[n];
        for (int i = 0; i < n; i++) {
            x[i] = String.valueOf(i);
        }
        return x;
    }


}
