package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    static long aVeryBigSum(long[] ar) {
        long sum =0;
        for(int i=0;i<ar.length;i++){
            sum += ar[i];
        }
        return sum;

    }
}
