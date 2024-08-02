package org.example;

import java.util.Arrays;

public class ReplaceElements {
    public static void main(String[] args) {
        int [] arr = {17,18,5,4,6,1};
        replaceElements(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static int[] replaceElements(int[] arr) {
        int i;
        for(i=0;i<arr.length-1;i++){
            int max = -1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>max) max = arr[j];
            }
            if(max>-1) arr[i] = max;
        }
        arr[i]=-1;
        return arr;
    }
}
