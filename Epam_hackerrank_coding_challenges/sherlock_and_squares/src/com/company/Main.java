package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    static int squares(int a, int b) {
        int count =0;
        for(int i=a;i<=b;i++){
            if(Math.sqrt(i)%1==0){
                count++;
            }
        }
        return count;

    }
}
