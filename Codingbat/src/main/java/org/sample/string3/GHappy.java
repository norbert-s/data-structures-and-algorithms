package org.sample.string3;

public class GHappy {

    public static void main(String[]args){
        System.out.println(gHappy("yyygggxyy"));
    }

    //https://codingbat.com/prob/p198664
    public static boolean gHappy(String str) {
        return !(str.replace("ggg","%")
                .replace("gg","%")
                .contains("g"));

    }
}
