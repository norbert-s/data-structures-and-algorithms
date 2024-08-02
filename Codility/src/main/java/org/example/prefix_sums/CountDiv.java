package org.example.prefix_sums;

public class CountDiv {
    public static void main(String[] args) {
        int res = countDiv(11, 345, 17);
        System.out.println(res);
    }

    public static int countDiv(int A, int B, int K){
        int ez = A % K == 0 ? 1 : 0;
        int ez2= (B / K) - (A /K)+ez;
        return ez2;
    }
}
