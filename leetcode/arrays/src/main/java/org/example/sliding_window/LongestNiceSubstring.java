package org.example.sliding_window;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestNiceSubstring {
    public static void main(String[] args) {
        LongestNiceSubstring instance = new LongestNiceSubstring();
        instance.longestNiceSubstring("abABB");
    }

    int k;
    List<List<Character>> list = new ArrayList<>();

    public List<List<Character>> longestNiceSubstring(String s) {
        for(k=2;k<s.length();k++){

            longestNiceSubstring(s,new ArrayList<Character>(),0);
        }
        return list;
    }
    public void longestNiceSubstring(String s,  List<Character> curr,int index) {
        if(index>s.length()){
            return;
        }
        if(curr.size()==k){

            System.out.println(curr.size());
            list.add(new ArrayList<>(curr));
            return;
        }

        for(int i=index;i<s.length();i++){
            Character ch = s.charAt(i);
            curr.add(s.charAt(i));
            System.out.println("curr"+curr);
            longestNiceSubstring(s,curr,i+1);
            curr.remove(ch);
        }
    }
}
