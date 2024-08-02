package org.sample.recursion;

public class ChangeXY {
    public static void main (String[]args){

    }
    public String changeXY(String str) {
        if(str.length()==0) return "";
        else if (str.length() == 1) {
            if(str.equals("x")) return "y";
            else return str;
        }
        else {
            if(str.charAt(str.length()-1)=='x') return changeXY(str.substring(0,str.length()-1))+"y";
            else return changeXY(str.substring(0,str.length()-1))+str.substring(str.length()-1);
        }
    }
}
