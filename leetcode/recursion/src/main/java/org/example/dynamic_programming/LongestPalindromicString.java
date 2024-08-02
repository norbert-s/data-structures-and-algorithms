package org.example.dynamic_programming;

public class LongestPalindromicString {
    public static void main(String[]args){
        LongestPalindromicString longestPalindromicString = new LongestPalindromicString();
        System.out.println(longestPalindromicString.longestPalindrome("abcba"));
    }
    public String longestPalindrome(String s) {
        if(s.length()==0|| s.length()==1) return s;
        String res = "";
        int length = 0;
        for(int i=s.length();i>1;i--){
            for(int j=0;j<i;j++){
                if((i-j)<length) break;
                String str = s.substring(j,i);
                if(str.length()>length){
                    if(isPalindrome(str)){
                        length=str.length();
                        res = str;
                    }
                }
            }
        }
        return res;

    }


    boolean isPalindrome(String s){
        int j=s.length()-1;
        for(int i=0;i<(s.length()/2);i++){
            if(s.charAt(i)!=s.charAt(j))return false;
            j--;
        }
        return true;
    }
}
