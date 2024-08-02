package com.company;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        /*
         * Write your code here.
         */
        int sum =0;
        for(int i=0;i<ar.length;i++){
            sum+=ar[i];
        }
        return sum;
    }



    public static void main(String[] args) throws IOException {

    }
}
