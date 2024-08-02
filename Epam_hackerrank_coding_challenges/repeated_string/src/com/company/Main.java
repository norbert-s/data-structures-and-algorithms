package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(repeatedString("ab",1000));
//        repeated();
//        String a = "safsadfdsf fsf esfds  fdsf dsf ";
//        repeatedString(a,3);
        System.out.println(3/0.15);
    }
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long akAzAlapstringben =0;
        long akAMaradekban =0;
        long osztas = 0;
        osztas = n/s.length();//
        long maradek = n%s.length();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')
                akAzAlapstringben++;
        }
        for(int i=0;i<maradek;i++){
            if(s.charAt(i)=='a')
                akAMaradekban++;
        }
        long osszeg = osztas*akAzAlapstringben+akAMaradekban;

        return osszeg;

    }


//    public static void repeatedstring(String s, long n){
//        long count =0;
//        List<String> a =  Arrays.asList(s);
//        System.out.println(a);
//
//    }
//
//    public static void repeated(){
//        int sum = IntStream.range(1,5).filter(x->x%2==0).sum();
//        System.out.println(sum);
//    }
}
