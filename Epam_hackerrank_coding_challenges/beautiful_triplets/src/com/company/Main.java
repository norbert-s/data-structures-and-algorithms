package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    // Complete the beautifulTriplets function below.
    static int beautifulTriplets(int d, int[] arr) {
        int count =0;

        for(int i=0;i<arr.length-2;i++){
            int ari = arr[i];
            for(int j=i+1;j<arr.length-1;j++){
                int arj = arr[j];
                if(ari<arj && arj-ari==d){
                    for(int k=i+2;k<arr.length;k++){
                        int ark = arr[k];
                        if( ark-arj==d){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
