package org.example.backtracking.permutation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {

    //accepted
    public static void main(String [] args){
        LetterCombinationsOfAPhoneNumber letterCombinationsOfAPhoneNumber = new LetterCombinationsOfAPhoneNumber();
        System.out.println(letterCombinationsOfAPhoneNumber.letterCombinations("34"));
    }
    String[]arr;
    List<String> list=new ArrayList<>();
    String str;
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return list;
        arr = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        str=digits;
        letterCombinations(0,new StringBuilder());
        return list;
    }

    public void letterCombinations(int index,StringBuilder path) {
        if(path.length()==str.length()){
            list.add(path.toString());
            return;
        }
        String letters = arr[str.charAt(index)-48-2];
        for(char i : letters.toCharArray()){

            path.append(i);

            letterCombinations(index+1,path);

            path.delete(path.length()-1,path.length());
        }
    }
}
