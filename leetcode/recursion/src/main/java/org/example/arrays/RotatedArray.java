package org.example.arrays;

public class RotatedArray {
    public static void main(String[] args) {
        int [] nums = {4,5,6,1,2,3};

    }
    //leetcode
    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e-s) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m-1);
            } else {
                return search(arr, target, m+1, e);
            }
        }

        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m+1, e);
        }

        return search(arr, target, s, m-1);
    }

    //educative.io
    public static int binarySearch(int[] arr, int start, int end, int key) {
        // assuming all the keys are unique.

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == key) {
            return mid;
        }

        if (arr[start] <= arr[mid] && key <= arr[mid] && key >= arr[start]) {
            return binarySearch(arr, start, mid - 1, key);
        }

        else if (arr[mid] <= arr[end] && key >= arr[mid] && key <= arr[end]) {
            return binarySearch(arr, mid + 1, end, key);
        }

        else if (arr[end] <= arr[mid]) {
            return binarySearch(arr, mid + 1, end, key);
        }

        else if (arr[start] >= arr[mid]) {
            return binarySearch(arr, start, mid - 1, key);
        }

        return -1;
    }

    static int binarySearchRotated(int[] arr, int key) {
        return binarySearch(arr, 0, arr.length - 1, key);
    }



}
