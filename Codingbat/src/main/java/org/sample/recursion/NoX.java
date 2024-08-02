package org.sample.recursion;

public class NoX {
    public static void main (String[]args){

    }
    public String noX(String str) {
        if(str.length()==0) return "";
        else if (str.length() == 1) {
            if(str.equals("x")) return "";
            else return str;
        }
        else {
            if(str.charAt(str.length()-1)=='x') return noX(str.substring(0,str.length()-1));
            else return noX(str.substring(0,str.length()-1))+str.substring(str.length()-1);
        }
    }
}
