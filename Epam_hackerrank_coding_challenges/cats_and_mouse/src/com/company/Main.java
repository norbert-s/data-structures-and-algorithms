package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        int catA = Math.abs(z-x);
        int catB = Math.abs(z-y);
        if(catA==catB){
            return "Mouse C";
        }
        else if(catA<catB){
            return "Cat A";
        }
        else  {
            return "Cat B";
        }


    }
}
