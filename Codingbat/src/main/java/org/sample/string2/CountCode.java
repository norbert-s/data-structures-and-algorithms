package org.sample.string2;

public class CountCode {

    public static void main (String[]args){
        System.out.println(countCode("aaacodebbb"));
        System.out.println( countCode("codexxcode"));
        System.out.println(countCode("cozexxcope"));
    }
    public static int countCode(String str) {
        if(str.length()<4) return 0;
        int count =0;
        for(int i=0;i<str.length()-3;i++){
            if(str.charAt(i)==('c')&&str.charAt(i+1)==('o')&&str.charAt(i+3)==('e'))count++;
        }
        return count;
    }

}
