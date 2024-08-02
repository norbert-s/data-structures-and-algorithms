package org.sample.recursion;

public class PowerN {
    public static void main (String[]args){

    }
    public int powerN(int base, int n) {
        if(n==1) return base;
        return base*powerN(base,n-1);
    }

}
