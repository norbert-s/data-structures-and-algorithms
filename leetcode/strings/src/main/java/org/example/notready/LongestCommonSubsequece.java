package org.example.notready;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubsequece {

    public static void main(String [] args) {
        String s1= "oxcpqrsvwf";
        String s2= "shmtulqrypy";
//        String s1= "oxc";
//        String s2= "shmtulqrcpy";
        longestCommonSubsequenceReqHelper(s1,s2);
        System.out.println(res);
    }

    public void longestCommonSubsequence1(String text1, String text2) {
        lcs(text1, text2, 0, 0);
    }

//    public int lcs(String text1, String text2, int i, int j) {
//        if (i > text1.length() - 1 || j > text2.length() - 1)
//            return 0;
//        else if (text1.charAt(i) == text2.charAt(j))
//            return 1 + lcs(text1, text2, i + 1, j + 1);
//        else
//            return Math.max(lcs(text1, text2, i + 1, j), lcs(text1, text2, i, j + 1));
//
//    }

    public void lcs(String text1, String text2, int i, int j) {
        if (i > text1.length() - 1 || j > text2.length() - 1)
            System.out.println(text1);
        else if (text1.charAt(i) == text2.charAt(j))
            lcs(text1, text2, i + 1, j + 1);



    }



    static List<List<String>> res = new ArrayList<>();

    public static void longestCommonSubsequenceReqHelper(String text1, String text2) {
        longestCommonSubsequenceReq(text1,text2,new ArrayList<>());
    }


    public static void longestCommonSubsequenceReq(String text1, String text2,List<String> curr) {
        if(text1.equals("")|| text2.length()==0) {
            res.add(new ArrayList<>(curr));
        }
        int length1 = text1.length();
        int length2 = text2.length();

        int indexPTR=0;

        for(int i=0;i<length1 &&indexPTR<length2;i++){
            String substringOfSecond = text2.substring(indexPTR,length2);
            char currChar = text1.charAt(i);
            if(substringOfSecond.indexOf(currChar)>=0){
                indexPTR=substringOfSecond.indexOf(currChar);
                curr.add(String.valueOf(substringOfSecond.charAt(indexPTR)));
                indexPTR++;
                longestCommonSubsequenceReq(text1.substring(i+1),text2,curr);

                curr.remove(curr.size()-1);

                longestCommonSubsequenceReq(text1.substring(i+1),text2,curr);
            }
        }
        //System.out.println(curr);
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        int length1 = text1.length();
        int length2 = text2.length();

        int indexPTR=0;
        List<String> list = new ArrayList<>();
        for(int i=0;i<length1 &&indexPTR<length2;i++){
            String substringOfSecond = text2.substring(indexPTR,length2);
            char curr = text1.charAt(i);
            if(substringOfSecond.indexOf(curr)>=0){
                indexPTR=substringOfSecond.indexOf(curr);
                list.add(String.valueOf(substringOfSecond.charAt(indexPTR)));
                indexPTR++;
            }

        }
        return list.size();
    }
}
