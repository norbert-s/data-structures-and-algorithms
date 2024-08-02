package org.example.string;

/**
 * Hello world!
 */
public class ReverseString {
    public static void main(String[] args) {

        String str = "asdfg";
        System.out.println(reverseString(str));

//        char [] c = new char[]{'a','b','c'};
//        reverseString(c);

    }
    private static String reverseString(String str){
        if(str.length()==0)
            return "";

        return str.substring(str.length()-1)+reverseString(str.substring(0,str.length()-1));
    }

//    public static char reverseString(char[] c) {
//        if(c.length==1)
//            return c[c.length-1];
//        return c[c.length-1]+
//    }
}
