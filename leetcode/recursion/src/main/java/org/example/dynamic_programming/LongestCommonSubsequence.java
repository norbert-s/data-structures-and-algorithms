package org.example.dynamic_programming;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        System.out.println(longestCommonSubsequence.longestCommonSubsequence("aecfg","adbfcfeg"));
    }

    public  int longestCommonSubsequence(String text1, String text2) {
        longestCommonSubsequenceRec2(text1,text2,0,0);
        return longestCommonCounter;

    }

    int longestCommonCounter = 0;

    public  void longestCommonSubsequenceRec2(String text1, String text2,int index,int counter) {
        if(index==text1.length()){
            if (counter>longestCommonCounter){
                longestCommonCounter=counter;
            }
            return ;
        }
        else{
            for(int i=index;i<text1.length();i++){
                String letter = text1.substring(index,index+1);
//                System.out.println(letter);
                int firstOccurence = text2.indexOf(letter);
                if(firstOccurence>=0){
                    counter++;
                    longestCommonSubsequenceRec2(text1,text2.substring(firstOccurence+1),i+1,counter);
                    counter--;
                }
                else{
                    longestCommonSubsequenceRec2(text1,text2,i+1,counter);
                }
            }
        }
    }
}

