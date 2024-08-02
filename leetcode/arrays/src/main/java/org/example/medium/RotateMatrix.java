package org.example.medium;

import java.util.Arrays;

public class RotateMatrix {

    public static void main(String[] args) {

        int nums[][] = {{1, 2, 3, 4, 5},
                {5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24}
        };
//        rotateCounterClockwise(nums);
        transposeForClockwise(nums);
        inverseColumnOrder(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void inverseColumnOrder(int[][] matrix){
        int n= matrix.length;

        for(int i=0;i<n;i++){
            int k=n-1;
            for(int j=0;j<n/2;j++){
                int temp = matrix [i][j];
                matrix [i][j] =matrix[i][k];
                matrix[i][k]=temp;
                k--;
            }
        }
    }

    static void transposeForClockwise(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateCounterClockwise(int[][] matrix) {
        int sor = matrix.length;
        int oszlop = matrix[0].length;
        int arr[][] = new int[oszlop][sor];
        //rotate 90 degrees counter clockwise
        for (int i = 0, col2 = 0; i < sor && col2 < sor; i++, col2++) {
            for (int j = oszlop - 1, row2 = 0; j >= 0 && row2 < oszlop; j--, row2++) {
                arr[row2][col2] = matrix[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void rotateClockwise(int[][] matrix) {
        int arr[][] = new int[matrix.length][matrix.length];
        int n = matrix.length;
        //rotate 90 degrees clockwise
        for (int i = 0, col2 = n - 1; i < n && col2 >= 0; i++, col2--) {
            for (int j = 0, row2 = 0; j < n && row2 < n; j++, row2++) {
                arr[row2][col2] = matrix[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
