package org.sample.array3;

public class MaxSpan {
    public int maxSpan(int[] nums) {
        int min=100000000;
        int max=-100000000;
        int actual=0;
        int maxSpan=0;
        int length = nums.length;
        for(int i=0;i<length;i++){
            actual = nums[i];
            if(actual<min){
                min=actual;
            }
            if(actual>max){
                max=actual;
            }

        }
        for(int i=min;i<=max;i++){
            int counter=0;
            boolean flag = false;
            int indexMin=0;
            int indexMax=0;
            for(int j=0;j<length;j++){
                actual = nums[j];
                if(actual==i && flag==false){
                    flag=true;
                    indexMin= j;
                }
                if(actual==i && flag ==true){
                    indexMax=j;
                }
            }
            if(indexMax-indexMin+1>maxSpan){
                maxSpan=indexMax-indexMin+1;
            }
        }
        return maxSpan;



    }
}
