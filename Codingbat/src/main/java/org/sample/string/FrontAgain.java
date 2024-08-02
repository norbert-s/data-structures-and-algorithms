package org.sample.string;

public class FrontAgain {


    public boolean frontAgain(String str) {
        if(str.length()==2)return true;
        else if(str.length()==3){
            if(str.charAt(0)==str.charAt(1)&&str.charAt(1)==str.charAt(2))return true;
        }
        else if(str.length()>3){
            if(str.substring(0,2).equals(str.substring(str.length()-2)))return true;
        }
        else return false;
        return false;
    }

}
