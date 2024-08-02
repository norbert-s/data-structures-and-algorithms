package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(saveThePrisoner(7,19,2));
    }

    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s) {
        // prisoners 7
        // candys 19
        // innentol 2
        int prisoners = n;
        int candys = m;
        int innentol = s;
        int counter =0;
        int maradek = (m+s-1)%prisoners;
        if(maradek==0){
            return prisoners;
        }
        else{
            return maradek;
        }
    }
}
