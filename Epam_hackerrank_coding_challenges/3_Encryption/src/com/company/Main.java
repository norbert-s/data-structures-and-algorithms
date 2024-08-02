package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

    // Complete the encryption function below.
    static void encryption(String s) {
        String [] a = s.split(" ");
        String b = "";
        for(Object i: a){
            b+=i;
        }
        System.out.println(b);
        int length = b.length();
        System.out.println(length);
        int fl = (int)Math.floor((int)Math.sqrt(length));
        int ce = (int)Math.ceil((int)Math.sqrt(length));
        System.out.println(fl);

        String flTomb = "";
        ArrayList<String> c = new ArrayList<String>();
        for(int i=0;i<length-1;i+=7){
            c.add(b.substring(i,i+fl));
        }



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s = "if man was meant to stay on the ground god would have given us roots";
        encryption(s);
    }
}
