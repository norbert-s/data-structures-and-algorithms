package org.sample.string3;

public class EqualIsNot {
    public static void main(String[]args){
        System.out.println(equalIsNot("noisxxnotyynotxisi"));
    }
    //https://codingbat.com/prob/p141736
    public static boolean equalIsNot(String str) {
        if(str.length()==0)return true;
        String str2 = str.replace("is","%");
        String str3 = str2.replace("not","!");

        int counterIs =0;
        int counterNot = 0;
        for(int i=0;i<str3.length();i++){
            if(str3.charAt(i)=='%') counterIs++;
            if(str3.charAt(i)=='!') counterNot++;
        }
        return counterIs==counterNot;
    }
}
