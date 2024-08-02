package org.example.arrays;

import java.util.Arrays;
import java.util.Optional;

public class MaxCounter {
    int  [] nums ;
    int maxValue =0;
    int minValue =0;
    public int[] solution(int N, int[] A) {

        nums = new int [N];
        for(int i=0;i<A.length;i++){
            if(A[i]==N+1){
                minValue = maxValue;
            }
            else if(A[i]>=1 && A[i]<=N){
                nums[i-1] = Math.max(nums[i-1]+1,minValue+1);
                maxValue = Math.max(nums[i-1],maxValue);
            }
        }
        setToMax(minValue);

        return nums;
    }

    void setToMax(int minValue){
        for(int i=0;i<nums.length;i++){
            nums[i] = Math.max(nums[i],minValue);
        }
    }
}
