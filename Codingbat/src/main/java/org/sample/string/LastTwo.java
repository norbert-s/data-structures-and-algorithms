package org.sample.string;

public class LastTwo {
    public String lastTwo(String str) {
        String elsoFele="";
        if(str.length()>=2){
            String elso = String.valueOf(str.charAt(str.length()-2));
            String masodik = String.valueOf(str.charAt(str.length()-1));
            elsoFele = str.substring(0,str.length()-2);
            elsoFele+=masodik+elso;
            return elsoFele;
        }
        return str;
    }
}
