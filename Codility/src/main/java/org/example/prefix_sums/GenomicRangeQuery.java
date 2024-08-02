package org.example.prefix_sums;

import java.util.*;

public class GenomicRangeQuery {
    public static void main(String[] args) {
        long reference=System.nanoTime();
        int[] res = genomicRangeQuery("CAGCCTA", new int[]{2, 5, 0},new int[] {4, 5, 6});
        System.out.println(Arrays.toString(res));
        long finishm=System.nanoTime();
        System.out.println( ( (double)(finishm-reference) )/1000000000.0);
    }

    public static int[] genomicRangeQuery(String sOrig, int[] P, int[] Q){
        int []tomb = new int[P.length];
        String S = sOrig+"\n";
        StringBuilder numList = new StringBuilder();
        for (int i=0;i<S.length();i++){
            char charLocal = S.charAt(i);
            switch (charLocal){
                case 'A':
                    numList.append(1);
                    break;
                case 'C':
                    numList.append(2);
                    break;
                case 'G':
                    numList.append(3);
                    break;
                default:
                    numList.append(4);
                    break;
            }
        }
        numList.append("/");


        for(int i=0;i<P.length;i++){
            String str = numList.substring(P[i], Q[i] + 1);
            if(str.contains("1"))
                tomb[i] = 1;
            else if(str.contains("2"))
                tomb[i] = 2;
            else if (str.contains("3"))
                tomb[i] = 3;
            else
                tomb[i] = 4;
        }
        return tomb;
    }
}
