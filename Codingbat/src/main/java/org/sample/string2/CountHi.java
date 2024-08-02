package org.sample.string2;

public class CountHi {
    public int countHi(String str) {
        int counter=0;
        for(int i=0;i<str.length();i++){

            if(str.charAt(i)=='h' && str.length()>1){
                if(str.charAt(i+1)=='i'){
                    counter++;
                }
            }
        }
        return counter;
    }

}
