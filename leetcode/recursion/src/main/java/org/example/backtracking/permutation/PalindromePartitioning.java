package org.example.backtracking.permutation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PalindromePartitioning {
    List<List<String>>list=new ArrayList<>();
    String s="";
    public static void main(String[]args){
        PalindromePartitioning palindromePartitioning=new PalindromePartitioning();
        List<List<String>> listLocal = palindromePartitioning.partition("aab");
        System.out.println(listLocal);
    }
    public List<List<String>> partition(String s) {

        this.s=s;
        partition2(0,new ArrayList<>());
        return list;
    }
    public void partition2(int index,List<String>curr) {
        if(index==s.length()){
            list.add(new ArrayList<>(curr));
        }
        else{
            for(int i=index;i<s.length();i++){
                if(isPalindrome(s,index,i)){
                    curr.add(s.substring(index,i+1));
                    partition2(i+1,curr);
                    curr.remove(curr.size()-1);
                }
            }
        }
    }

    boolean isPalindrome(String s,int low,int high){
        while (low < high)
            if (s.charAt(low++) != s.charAt(high--)) return false;
        return true;
    }
}
