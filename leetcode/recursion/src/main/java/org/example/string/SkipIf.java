package org.example.string;

public class SkipIf {
    public static void main(String[] args) {

        System.out.println(skip("aaaasdaaaaaaaafaaaataaaaaa","a"));
    }

    public static String skip(String str,String letter) {
        if(str.length()==1){
            if(!str.equals(letter))
                return str;
        }
        else if(str.substring(0,1).equals(letter))
            return skip(str.substring(1),letter);
        else
            return str.charAt(0)+skip(str.substring(1),letter);

        return "";
    }
}
