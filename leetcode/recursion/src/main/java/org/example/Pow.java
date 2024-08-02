package org.example;

public class Pow {

    public static void main(String[] args) {

        System.out.println(myPow(2.00000, -2));
    }

    public static double myPow(double x, int n) {
        if (n < 0) {
            if (n == -1)
                return x;
            return (1 / x) * myPow(1 / x, -(n + 1));
        }
        if (n == 1)
            return x;
        return x * myPow(x, n - 1);
    }
}
