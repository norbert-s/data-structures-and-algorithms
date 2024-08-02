package org.example.integer;

public class PalindromeNumber {
    public static void main(String [] args){
//        System.out.println(palindromeNumber(111));
        System.out.println(isItPalindrome(1212));
    }

    private static boolean isItPalindrome(int num){
        return num == ReverseInt.reverseInt3(num);
    }

    public static boolean palindromeNumber(int num){
        int numberOfDigits = (int)Math.log10(num);
        if(numberOfDigits+1==1) return true;

        int right = num/(int)Math.pow(10,numberOfDigits);
        int left = num%10;

        if(right!=left) return false;
        if(numberOfDigits!=1) numberOfDigits -=1;
        int leftRemainder = num/10;
        int maradek = leftRemainder/(int)Math.pow(10,numberOfDigits);
        System.out.println(maradek);
        int rightRemainder =leftRemainder-(maradek*(int)Math.pow(10,numberOfDigits));

        return palindromeNumber(rightRemainder);
    }

}
