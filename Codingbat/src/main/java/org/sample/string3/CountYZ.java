package org.sample.string3;

public class CountYZ {
    public static void main(String[]args){
        System.out.println(countYZ("y2bz"));
    }
    //link to task https://codingbat.com/prob/p199171
    public static int countYZ(String str) {
        String [] strArr = str.split("[^a-zA-Z]");

        int counter=0;
        for(String i:strArr){
            if(i.toLowerCase().endsWith("y")||i.toLowerCase().endsWith("z"))
                counter++;
        }
        return counter;
    }
}
