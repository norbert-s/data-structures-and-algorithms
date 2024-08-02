package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }
    static void bonAppetit(List<Integer> bill, int k, int b) {

            int levonni = bill.get(k);
            int sum = 0;
            for(int i=0;i<bill.size();i++){
                if(i!=k){
                    sum += bill.get(i);
                }
            }
            int osszeg = sum/2;
            if(osszeg == b){
                System.out.println("Bon Appetit");
            }
            else{
                System.out.println(b-osszeg);
            }


    }
}
