package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int ca = 0;
        int co = 0;
        for (int i=0;i<apples.length;i++){
            if(apples[i]>0){
                if(a+apples[i]>=s && a+apples[i]<=t){
                    ca++;
                }
            }

        }
        for(int i=0;i<oranges.length;i++){
            if(oranges[i]<0){
                if(b+oranges[i]<=t && b+oranges[i]>=s){
                    co++;
                }
            }

        }
        System.out.println(ca);
        System.out.println(co);

    }

}
