package org.example.search;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(iterativeBinarySearch(arr,5));
        System.out.println(recursiveBinarySearch(arr,0,arr.length,5));
    }
    public static int recursiveBinarySearch(int [] arr, int left, int right, int target){
        if(left > right){
            return -1;
        }
        int center = (left + right)/2;
        if(arr[center]==target){
            return center;
        }else{
            if(arr[center]>target){
                return recursiveBinarySearch(arr,left,center-1,target);
            }else{
                return recursiveBinarySearch(arr,center+1,right,target);
            }
        }
    }
    public static int iterativeBinarySearch(int[] arr,int target){
        int left = 0;
        int right = arr.length;
        int center = (left + right)/2;
        while(left <= right && arr[center] != target){
            if(arr[center] > target){
                right = center-1;
            }
            else if(arr[center] < target){
                left = center+1;
            }
            center = (left + right)/2;
        }
        boolean valueExists = left<=right;
        if(valueExists){
            return center;
        }
        return -1;
    }
}
