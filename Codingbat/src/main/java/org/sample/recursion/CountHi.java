package org.sample.recursion;

public class CountHi {
    public static void main (String[]args){

    }
    public int countHi(String str) {
        if(str.length()==0){
            return 0;
        }
        else if(str.length()==2 && str.compareTo("hi")==0) return 1+countHi("");
        else if(str.length()==2 && str.compareTo("hi")!=0) return 0+countHi("");
        else if(str.length()>2 && str.substring(str.length()-2,str.length()).compareTo("hi")==0) return 1+countHi(str.substring(0,str.length()-1));
            //else if(str.length()>2 && !str.substring(str.length()-2,str.length()-1).equals("Pi")) return 0+changePi(str.substring(0,str.length()-1));
        else  return 0+countHi(str.substring(0,str.length()-1));
    }
}
