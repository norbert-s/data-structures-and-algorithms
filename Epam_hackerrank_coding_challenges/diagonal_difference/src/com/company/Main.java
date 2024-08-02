package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [][] a = {  {2,2,3},
                        {1,2,3},
                        {10,2,-12}};
        diagonalDifference(a);
    }

    static int diagonalDifference(int[][] arr) {

        int sum1 =arr[0][0]+arr[1][1]+arr[2][2];
        System.out.println(sum1);
        int sum2 = arr[0][2]+arr[1][1]+arr[2][0];
        System.out.println(sum2);
        int diff = Math.abs(sum1-sum2);
        System.out.println(diff);

        return diff;
    }
}
