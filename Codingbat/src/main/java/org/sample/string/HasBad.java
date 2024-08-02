package org.sample.string;

public class HasBad {
    public boolean hasBad(String str) {

        if(str.length()<3){
            return false;
        }
        else if(str.length()==3){
            int result = (str.substring(0,3)).compareTo("bad");
            if(result==0) return true;
        }
        else if(str.length()==4){
            int result = (str.substring(1,4)).compareTo("bad");
            if(result==0) return true;
        }
        else if(str.length()>4){
            int result = (str.substring(0,3)).compareTo("bad");
            int result2 = (str.substring(1,4)).compareTo("bad");
            if(result==0 || result2 ==0) return true;
        }

        return false;
    }

}
