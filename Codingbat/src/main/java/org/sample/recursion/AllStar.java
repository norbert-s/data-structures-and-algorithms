package org.sample.recursion;

public class AllStar {
    public static void main (String[]args){
        System.out.println(allStar("Chocolate"));
    }


    public static String allStar(String str) {
        int length = str.length();
        if(str.length()==0)
            return "";
        if(str.length()==1)
            return str.substring(0,1);
        return str.substring(0,1)+"*"+allStar(str.substring(length-(length-1),length));
    }

}
