package org.example.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestPalindromicString {
    public static void main(String[] args) {

        String s = "babad";
        System.out.println(longestPalindrome(s));
    }


    //time limit exceeded
    static String longestPalindrome(String s) {
        Set<String> set = new HashSet<>();
        String maxString = "";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String str = s.substring(i,j);

                if(str.length()>3){
                    //check if str center is in the set
                    // if it is and the additional start and end 2 chars are the same then no need to check if its a palindrom
                    //then add to set and check if it is longer than the previous max lenght palindrom
                    if(set.contains(str.substring(1,str.length()-1))&&str.substring(0,1).equals(str.substring(str.length()-1))){
                        set.add(str);
                        if(str.length()>maxString.length()) maxString = str;
                    }
                    else if(isItPalindrom(str)&&str.length()>maxString.length()){
                        set.add(str);
                        maxString = str;
                    }
                }
                else if(isItPalindrom(str)&&str.length()>maxString.length()){
                    set.add(str);
                    maxString = str;
                }
            }
        }
        return maxString;
    }

    static boolean isItPalindrom(String s){
        int j=s.length()-1;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(j))return false;
            j--;
        }
        return true;
    }

}
