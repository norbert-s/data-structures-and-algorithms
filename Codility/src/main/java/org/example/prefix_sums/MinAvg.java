package org.example.prefix_sums;

import java.util.Arrays;

public class MinAvg {
    public static void main(String[] args) {
        int [] arr = {4,2,2,5,1,5,8};
        System.out.println(solution(arr));
    }
    static public int solution(int[] A) {
        double minAverage = Integer.MAX_VALUE;
        int minaverageIndex = -1;
        for(int i=0;i<A.length;i++){
            int numOfElements = 0;
            int sum = 0;
            for(int j=i;j<A.length;j++){
                numOfElements++;
                sum+= A[j];
                if(numOfElements>1){
                    double currentAverage = sum*1.0/(numOfElements);
                    if(currentAverage<minAverage){
                        minAverage=currentAverage;
                        minaverageIndex=i;
                    }
                }

            }
        }
        return minaverageIndex;

    }
}
