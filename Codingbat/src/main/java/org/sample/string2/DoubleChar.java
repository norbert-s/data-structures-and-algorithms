package org.sample.string2;

public class DoubleChar {
    public String doubleChar(String str) {
        String tomb = "";

        for(int i=0;i<str.length();i++){
            tomb+= str.charAt(i);
            tomb+= str.charAt(i);

        }
        return tomb;
    }

}
