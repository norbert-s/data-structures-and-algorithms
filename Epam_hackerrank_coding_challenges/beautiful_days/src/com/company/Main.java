package com.company;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(beautifulDays(13,45,3));
    }

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int count =0;
        for(int a=i;a<=j;a++){
            String b = String.valueOf(a);
            String c = "";
            for(int d=b.length()-1;d>=0;d--){
                c += b.charAt(d);
            }
            String e = "";
            while(c.startsWith("0")){
                c = c.substring(1,c.length());
                System.out.println(e);
            }
            int masodik = Integer.parseInt(c);
            int kul = Math.abs(a-masodik);

            if(kul%k==0){
                count++;
            }


        }
        return count;

    }
}
