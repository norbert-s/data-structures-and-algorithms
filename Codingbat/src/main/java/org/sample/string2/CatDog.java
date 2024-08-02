package org.sample.string2;

public class CatDog {
    public boolean catDog(String str) {
        int dogCounter = 0;
        int catCounter = 0;
        for(int i=0;i<str.length()-2;i++){
            String sample= str.substring(i,i+3);
            if(sample.equals("dog")) dogCounter++;
            if(sample.equals("cat")) catCounter++;
        }

        if(dogCounter==catCounter) return true;
        else return false;
    }

}
