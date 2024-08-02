package org.sample.functional;

import java.util.List;

public class NoX {
    public List<String> noX(List<String> strings) {

        strings.replaceAll(n->removeX(n));
        return strings;
    }
    public String removeX(String str){
        String myString="";
        for(int i=0;i<str.length();i++){
            if(str.substring(i,i+1).compareTo("x")!=0){
                myString +=str.substring(i,i+1);
            }
        }
        return myString;
    }
}
