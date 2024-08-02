package org.sample.recursion;

public class SumDigits {
    public static void main (String[]args){

    }
    public int sumDigits(int n) {

        if(n/1==0){
            return n;
        }

        return n%10+sumDigits(n/10);
    }
}
