package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        // a = 54;
        // b = 23;
        // A  = BigInteger.valueOf(54);
        // B  = BigInteger.valueOf(37);

        BigInteger f = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        System.out.println(f);


    }
}
