package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }
    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        int cumul =0;
        int shared = 5;

        for(int i=1;i<=n;i++){

            int like = shared/2;
            cumul += like;
            shared = (shared/2)*3;
        }
        return cumul;

    }
}
