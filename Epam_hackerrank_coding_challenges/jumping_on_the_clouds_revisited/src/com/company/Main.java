package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[]c={0 ,0 ,1, 0, 0, 1, 0};
        System.out.println(jumpingOnClouds(c));
    }

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
        int e=100;
        for(int i=0;i<c.length;i=i+k){
            if(c[i]==0){
                e=e-1;
            }
            else{
                e=e-3;
            }
        }
        return e;

    }
}
