package org.example.medium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Atoi {

    public static void main(String[] args) {
        Atoi atoi = new Atoi();
        System.out.println(atoi.myAtoi("  0000000000012345678"));
    }
    public int myAtoi(String s) {
        if(s.length()==0)return 0;
        if(s=="")return 0;
        StringBuilder newString = new StringBuilder();
        boolean start =false;
        boolean digit =false;
        boolean alphabet =false;
        int countSign =0;
        Pattern special = Pattern.compile ("[!.@#$%&*()_=|<>?{}\\[\\]~]");
        
        for(int i=0;i<s.length();i++){
            if(!start){

                if(s.charAt(i)=='-'){
                    countSign++;
                    newString.append(s.charAt(i));
                }
                else if(s.charAt(i)=='+'){
                    countSign++;
                }
                else if(Character.isAlphabetic(s.charAt(i))){
                    alphabet=true;
                }
                else if(special.matcher(String.valueOf(s.charAt(i))).find()){
                    alphabet=true;
                }
                else if(alphabet&&Character.isDigit(s.charAt(i))){
                    return 0;
                }
                else if(countSign>1)return 0;
                else if (Character.isDigit(s.charAt(i))&&!start){
                    if(i==0){
                        digit=true;
                        start=true;
                        newString.append(s.charAt(i));
                    } else if (countSign==1&&s.charAt(i-1)=='-'||s.charAt(i-1)=='+') {
                        digit=true;
                        start=true;
                        newString.append(s.charAt(i));
                    }else if (countSign==1&&(s.charAt(i-1)!='-'||s.charAt(i-1)!='+')){
                        return 0;
                    }else{
                        digit=true;
                        start=true;
                        newString.append(s.charAt(i));
                    }

                }
            }  else if (!Character.isDigit(s.charAt(i))&&start) {
                break;
            }else if (Character.isDigit(s.charAt(i))&&start){
                newString.append(s.charAt(i));
            }
        }
        if(!digit)return 0;
        if(!start) return 0;
        int val;
        if(newString.charAt(0)=='-'){
            try{
                val = Integer.valueOf(newString.toString());
            }catch(NumberFormatException ne){
                return Integer.MIN_VALUE;
            }
        }else{
            try{
                val = Integer.valueOf(newString.toString());
            }catch(NumberFormatException ne){
                return Integer.MAX_VALUE;
            }
        }
        return val;

    }
}

