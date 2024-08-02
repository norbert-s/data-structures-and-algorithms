package org.example;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int [] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==0){
                int j=arr.length-1;
                while(j>i){
                    arr[j] = arr[j-1];
                    j--;
                }
                i=j+1;
            }
        }
    }
}
