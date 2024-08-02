package org.example;

public class IsIntegerPalindrome {
    public static void main(String[] args) {
        int num = 1002;

        System.out.println(isItPalindrom(10211));
    }
    public static boolean isItPalindrom(int num) {
        String [] tomb = String.valueOf(num).split("");

        int j = tomb.length-1;
        for(int i=0;i< tomb.length/2;i++){

            if(!tomb[i].equals(tomb[j])) return false;
            j--;
        }
        return true;
    }
}
