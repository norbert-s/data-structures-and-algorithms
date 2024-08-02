package com.company;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] a = {-4, 3 ,-9, 0 ,4 ,1 };
        plusMinus(a);
    }

    static void plusMinus(int[] arr) {
        int minus =0;
        int plus =0;
        int zero =0;
        for(int i=0;i<arr.length;i++){
            int e = arr[i];
            if(e>0){
                plus++;
            }
            else if(e<0){
                minus++;
            }
            else{
                zero++;
            }
        }
        double m = (double)minus/arr.length;
        double p = (double)plus/arr.length;;
        double z = (double)zero/arr.length;;
        System.out.println(String.format("%.6f", p));
        System.out.println(String.format("%.6f", m));
        System.out.println(String.format("%.6f", z));

    }
}
