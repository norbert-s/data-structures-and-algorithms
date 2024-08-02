package org.example.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInStringsIII {
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String s) {
        String [] str = s.split(" ");
        StringBuilder newString = new StringBuilder();

        for(int i=0;i<str.length;i++){
            String innerString = str[i];
            for(int j=str[i].length()-1;j>=0;j--){
                newString.append(innerString.charAt(j));
            }
            newString.append(" ");
            //System.out.println(c);

        }

        return newString.toString().stripTrailing();

    }
}
