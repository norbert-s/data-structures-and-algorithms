package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {
        int max = height[0];
        for(int i=1;i<height.length;i++){
            if(height[i]>max){
                max = height[i];
            }
        }
        if((max-k)<=0){
            return 0;
        }
        else{
            return max-k;
        }


    }
}
