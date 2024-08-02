package org.example;

public class BinarySearch {
    public static void main(String[] args) {
        int arr [] = {1,3,5,7,9,100};
        System.out.println(binarySearch(arr,0));

    }
    private static int binarySearch(int [] arr,int val){
//        return binarySearchHelper(arr,0,arr.length,val);
        return binarySearchRecursive(arr,val,0,arr.length-1);
    }

    //Gayle Mcdowell
    public static int binarySearchRecursive(int[] a, int x, int low, int high) {
        if (low > high) return -1; // Error

        int mid = (low + high) / 2;
        if (a[mid] < x) {
            return binarySearchRecursive(a, x, mid + 1, high);
        } else if (a[mid] > x) {
            return binarySearchRecursive(a, x, low, mid - 1);
        } else {
            return mid;
        }
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return search(arr, target, s, m - 1);
        }
        return search(arr, target, m + 1, e);
    }
}
