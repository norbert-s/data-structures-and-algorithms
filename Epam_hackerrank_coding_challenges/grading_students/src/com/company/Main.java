package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] a = {4,73,67,38,33};
        int [] b = gradingStudents(a);
        System.out.println(Arrays.toString(b));
    }

    static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
        int a = 0;
        ArrayList<Integer> c = new ArrayList<Integer>();
        for(int i: grades){


            if(i>37){
//                double x = Math.ceil((double)i/(double)10);
//                System.out.println(x);
//                int y = (int)x*10;
//                System.out.println(y);

                int osztas = 1+(i/5);
                int otSzorzat = osztas*5;

                if((otSzorzat-i)<3){
                    c.add(otSzorzat);
                }
                else{
                    c.add(i);
                }
            }
            else if(i<=37){
                c.add(i);
            }
        }
        int[]tomb =new int [c.size()];
        for(int i=0;i<c.size();i++){
            tomb[i]=c.get(i);
        }
        return tomb;


    }
}
