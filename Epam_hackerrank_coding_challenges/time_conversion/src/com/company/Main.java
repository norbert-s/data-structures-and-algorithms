package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(timeConversion("12:00:00AM"));
    }
//nem fogadta el az összes tesztet
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        //Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
        String ezt = "";
        if(s.contains("PM")){

            if(s=="12:00:00PM"){
                ezt = "12:00:00";
            }
            else{
                int ora = Integer.parseInt(s.substring(0,2));
                ora += 12;
                String itt = s.substring(2,s.length()-2);
                ezt= ora+itt;
            }
        }
        else{
            if(s=="12:00:00AM"){
                ezt = "00:00:00";
            }
            else{
                ezt = s.substring(0,s.length()-2);
            }
        }
        return ezt;
    }
}
