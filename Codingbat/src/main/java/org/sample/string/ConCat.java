package org.sample.string;

public class ConCat {
    public String conCat(String a, String b) {
        if(a.length()==0) return b;
        else if(b.length()==0)return a;
        else if(b.length()==0 && a.length()==0) return "";
        else{
            char k = a.charAt(a.length()-1);
            char j = b.charAt(0);
            if(k==j){
                return a+b.substring(1);
            }
            else{
                return a+b;
            }
        }

    }
}
