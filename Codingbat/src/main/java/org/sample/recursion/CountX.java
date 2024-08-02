package org.sample.recursion;

public class CountX {
    public static void main (String[]args){

    }
    public int countX(String str) {
        if(str.length()==0) return 0;
        else if(str.length()==1 && str.charAt(str.length()-1)=='x') return 1+countX("");
        else if(str.length()==1 && str.charAt(str.length()-1)!='x') return 0+countX("");
        else if(str.length()>1 && str.charAt(str.length()-1)=='x') return 1+countX(str.substring(0,str.length()-1));

        else  return 0+countX(str.substring(0,str.length()-1));

    }
}
