package org.example;

import java.nio.charset.StandardCharsets;

/**
 * Hello world!
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] tomb = {"asdfghsafgdsa","asdfg","asdfghjkl","asdfghj","asdfgh"};
        System.out.println(longestCommonPrefix(tomb));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0 ) return "";

        String firstStr = strs[0];

        for (int i=1;i<strs.length;i++){
            int j;
            for(j=0;j<strs[i].length() &&j<firstStr.length();j++){
                if( strs[i].charAt(j)!=firstStr.charAt(j)) break;
            }
            if(firstStr.length()!=j)
                firstStr = strs[i].substring(0,j);

        }
        return firstStr;
    }
}
