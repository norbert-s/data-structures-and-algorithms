package org.example.dynamic_programming;

public class IsSubsequence {
    public static void main(String[] args){
        IsSubsequence isSubsequence = new IsSubsequence();

        System.out.println(isSubsequence.isSubsequence("aaaaaa","bbaaaa"));
    }




    public boolean isSubsequence(String s, String t) {
        if(t.length()==0||s.length()==0)return false;
        int counter=0;
        int j=0;
        for(int i=0;i<s.length()&&j<t.length();i++){
            while(s.charAt(i)!=t.charAt(j)&&j<t.length()-1){
                j++;
            }
            if(s.charAt(i)==t.charAt(j)){
                counter++;
                j++;
            }
        }
        if(counter==s.length())return true;
        else return false;
    }
}
