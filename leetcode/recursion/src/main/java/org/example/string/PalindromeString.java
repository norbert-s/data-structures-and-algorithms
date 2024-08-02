package org.example.string;

public class PalindromeString {
    public static void main(String [] args){
//        System.out.println(palindromeNumber(111));
//        System.out.println(reverseString("asad"));
        System.out.println(isItPalindrome2("annna"));
//        int numberOfDigits = (int)Math.log10(1234);
//        System.out.println(numberOfDigits);
    }
//    static boolean isItPalindrome(String str){
//        return str.equals(reverseString(str));
//    }
//
//    static String reverseString(String str){
//        if(str.length()==1){
//            return str;
//        }
//
//        return str.substring(str.length()-1)+reverseString(str.substring(0,str.length()-1));
//    }

    private static boolean isItPalindrome2( String str){
        if(str.length()==0||str.length()==1) return true;
        String head = str.substring(0,1);
        String middle = str.substring(1,str.length()-1);
        String last = str.substring(str.length()-1);
        System.out.println(head+" "+middle+" "+last);
        return head.equals(last) && isItPalindrome2(middle);
    }
}
