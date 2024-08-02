package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        int money =b;
        int max = 0;
        int lengthk= keyboards.length;
        int lengthd = drives.length;
        boolean exists = false;
//        int indexi = 0;
//        int indexj = 0;
        for(int i=0;i<lengthk;i++){
            for (int j=0;j<lengthd;j++){
                int sum = keyboards[i]+drives[j];
                if(sum<=money && sum>max){
                    max = sum;
//                    indexi = i;
//                    indexj = j;
                    exists = true;
                }
            }
        }

        if(!exists){
            return -1;
        }
        else{
            return max;
        }

    }
}
