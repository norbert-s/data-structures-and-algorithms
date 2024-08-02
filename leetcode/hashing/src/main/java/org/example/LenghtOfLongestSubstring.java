package org.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class LenghtOfLongestSubstring {
    public static void main(String[]args){
        //String str1 = "dvdf";
        //String str1 ="abcabcbb";
        String str1 = "jbpnbwwd";

        System.out.println(lengthOfLongestSubstring(str1));

    }

    //mine
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new LinkedHashSet<>();

        int maxSize = 0;

        for(int i=0;i<s.length();i++){
            set.clear();
            for(int j=i;j<s.length();j++) {
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                    if (set.size() > maxSize) {
                        maxSize = set.size();
                    }
                } else {
                    if (set.size() > maxSize) {
                        maxSize = set.size();
                    }
                    set.clear();
                    break;

                }
            }
        }
        return maxSize;
    }
}
