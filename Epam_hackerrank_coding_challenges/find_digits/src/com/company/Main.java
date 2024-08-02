package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    // Complete the findDigits function below.
    static int findDigits(int n) {
        String a = Integer.toString(n);
        String [] b = a.split("");
        System.out.println(a);
        int szam = 0;
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            szam = Integer.parseInt(b[i]);
            if(szam==0){

            }
            else if (n % szam == 0) {
                count++;
            }
        }
        return count;

    }
}
