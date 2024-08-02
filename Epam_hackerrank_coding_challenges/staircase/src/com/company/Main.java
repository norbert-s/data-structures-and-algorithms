package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        paint(10);
    }

    static void staircase(int a) {
        int i =a-1;
        for(int j=a;j>0;j--){
            String ures = "";
            String szo ="";
            for(int k=0;k<a;k++){
                ures += "#";
            }
            String hash = "";
            String szokoz = "";
            hash = ures.substring(j-1,a);
            for(int l=i;l>0;l--){
                szokoz += " ";
            }
            i--;
            szo+=szokoz;
            szo+=hash;
            System.out.println(szo);
        }
    }
}
