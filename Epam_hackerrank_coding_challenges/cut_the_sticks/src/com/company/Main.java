package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here


    }

    // Complete the cutTheSticks function below.
    static List<Integer> cutTheSticks(int[] arr) {
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            a.add(arr[i]);
        }
        while(a.size()!=0){
            int min =a.get(0);
            for(int i=0;i<a.size();i++){
                if(a.get(i)<min){
                    min = a.get(i);
                }
            }//kivalasztom a legkisebbet


            int count =0;

            for(int i=0;i<a.size();i++){
                if(a.get(i)>min){
                    a.set(i,a.get(i)-min);
                    count++;
                }
                else if(a.get(i)==(min)){
                    a.remove(i);
                    count++;
                    i-=1;

                }
            }
            b.add(count);
        }
        return b;
    }
    // konzolon szar volt

    List<Integer> result = cutTheSticks(arr);

        for (int i = 0; i < result.size(); i++) {
        bufferedWriter.write(String.valueOf(result.get(i)));

        if (i != result.size() - 1) {
            bufferedWriter.write("\n");
        }
    }