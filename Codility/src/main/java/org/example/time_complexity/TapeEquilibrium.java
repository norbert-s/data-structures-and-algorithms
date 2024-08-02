package org.example.time_complexity;

import java.util.Optional;

/**
 * Hello world!
 */
public class TapeEquilibrium {
    public static void main(String[] args) {
        int [] tape = {-1000,1000};
        int tapeRes = tapeEquilibrium(tape);
        System.out.println(tapeRes);
    }

    public static int tapeEquilibrium(int[] A) {
        Optional<Integer> minValue =Optional.empty();
        int osszeg =0;
        for(int i=0;i<A.length;i++){
            osszeg+=A[i];
        }
        int jobb=0;
        for(int i=0;i<A.length-1;i++){
            jobb += A[i];
            int bal = osszeg-jobb;
            int diff = (jobb-bal);
            if(diff<0) diff *= -1;
            if(minValue.isEmpty()) minValue = Optional.of(diff);
            if(minValue.isPresent() ){
                if(diff< minValue.get()){
                    minValue=Optional.of(diff);
                }
            }
        }
        return minValue.get();
    }
}
