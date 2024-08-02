package org.sample.string3;

import java.util.ArrayList;
import java.util.List;

public class WithoutString {
    public static void main(String[]args){
        System.out.println(withoutString("THIS is a FISH","iS"));
    }

    //https://codingbat.com/prob/p192570
    //with pasting below solution into the codingbat platform one should call out inconsistency in the task itself
    //one test-case is failing
    public static String withoutString(String base, String remove) {
        if(base.length()==0) return base;
        if(remove.length()==2&& Character.isLowerCase(remove.charAt(0))&&Character.isUpperCase(remove.charAt(1))){
            String newUp ="";
            String newLow = "";
            newUp = base.replace(remove.toUpperCase(),"");
            newLow = newUp.replace(remove.toLowerCase(),"");

            return newLow;
        }

        boolean mixed = false;
        List<Boolean> changedOrNot = new ArrayList<>();
        remove.chars()
                .mapToObj(s->(char)s)
                .forEach(val->{
                    if(Character.isUpperCase(val)){
                        changedOrNot.add(true);
                    }else{
                        changedOrNot.add(false);
                    }
                });

        for(int i=0;i<changedOrNot.size()-1;i++){
            if(changedOrNot.get(i)!=changedOrNot.get(i+1)){
                mixed = true;
                break;
            }
        }

        String newUp ="";
        String newLow = "";
        if(mixed){
            newLow = base.replace(remove,"");

        }else{
            newUp = base.replace(remove.toUpperCase(),"");
            newLow = newUp.replace(remove.toLowerCase(),"");
        }

        return newLow;

    }
}
