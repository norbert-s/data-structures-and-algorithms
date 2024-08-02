package org.example.medium;

public class LongestRepeatingSubstring {
    //https://leetcode.com/problems/longest-repeating-substring/
    public static void main(String[] args) {
        String s ="aaaaa";
        System.out.println(longestRepeatingSubstring(s));
    }
    static public int longestRepeatingSubstring(String s) {
        int longest =0;
        for(int i=0;i<s.length()-1&&i<s.length()-longest;i++){
            for(int j=i+1;j<s.length();j++){
                String left = s.substring(i,j);
                String right = s.substring(i+1);
                if(right.contains(left)&&longest<left.length()){
                    longest=left.length();
                }
            }
        }
        return longest;
    }
}
