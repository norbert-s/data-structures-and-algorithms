package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(utopianTree(6));
    }

    // Complete the utopianTree function below.
    static int utopianTree(int n) {
        if(n==0){
            return 1;
        }
        int osszeg=1;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                osszeg*=2;
            }
            else{
                osszeg+=1;
            }
        }
        return osszeg;
    }
}
