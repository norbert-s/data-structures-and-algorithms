package org.example.backtracking.permutation;

import java.util.*;
import java.util.stream.Collectors;

public class LongestPalindromeByConcatenatingTwoWords {
    List<List<String>> list = new ArrayList<>();
    Set<String> set = new HashSet<>();
    String arr [] ;
    int k=0;
    int maxlength =0;
    public static void main(String[]args){
        LongestPalindromeByConcatenatingTwoWords instance = new LongestPalindromeByConcatenatingTwoWords();
        String [] arr ={"dd","aa","bb","dd","aa","dd"};;
        System.out.println(instance.longestPalindrome(arr));
    }
    public  int longestPalindrome(String[] words) {
        this.arr = words;
        Arrays.stream(arr).forEach(s-> System.out.print(s+" "));
        for(k=1;k<=arr.length;k++){
            longestPalindrome(0,new ArrayList<>());
        }
        System.out.println(list);
        return maxlength;
    }

    public  void longestPalindrome(int index,List<String>curr) {
        if(curr.size()==k){
            if(isItPalindrome(curr)){
                String str = curr.stream().collect(Collectors.joining());
                if(str.length()>maxlength) maxlength = str.length();
                list.add(new ArrayList<>(curr));
                if(maxlength==(k*2)){
                    k++;
                }
            }
            return;
        }else if(index > arr.length||k>arr.length){
            return;
        }
        for(int i=index;i<arr.length;i++){
            curr.add(arr[i]);
            longestPalindrome(index,curr);
            curr.remove(curr.size()-1);
        }
    }

    boolean isItPalindrome(List<String>curr){
        String str = curr.stream().collect(Collectors.joining());

        for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--){
            if(str.charAt(i)!=str.charAt(j)) return false;
        }
        return true;
    }
}
