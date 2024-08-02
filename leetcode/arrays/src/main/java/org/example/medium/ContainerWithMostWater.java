package org.example.medium;

public class ContainerWithMostWater {

    public static void main(String[] args) {

    }
    static public int maxArea2(int[] height) {
        int maxSum = Integer.MIN_VALUE;
        int i=0;
        int j=height.length-1;
        while(i<j){
            maxSum = Math.max(maxSum,Math.min(height[i],height[j])*(j-i));
            if(height[j]>=height[i]) j--;
            else i++;

        }
        return maxSum;
    }

    //time limit exceeded 56/61 passed
    static public int maxArea(int[] height) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i< height.length-1;i++){
            for(int j=i;j< height.length;j++){
                int distance = j-i;
                int commonHeight = Math.min(height[i],height[j]);
                if((commonHeight*distance)>maxSum){
                    maxSum = commonHeight*distance;
                }
            }
        }
        return maxSum;
    }
}
