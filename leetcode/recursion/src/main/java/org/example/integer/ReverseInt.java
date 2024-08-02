package org.example.integer;

import java.util.ArrayList;
import java.util.List;

public class ReverseInt {
    public static void main(String [] args){
        //reverseInt(1234); //4321
        //reverseInt2(1234);
//        System.out.println(reverseInt2(122456654));
        System.out.println(reverseInt3(123456));
    }

    static List<Integer> list = new ArrayList<>();
    public static void reverseInt(int num){
        if(num == 0){
            return;
        }

        list.add(num%10);
        reverseInt(num/10);
    }

    public static int reverseInt2(int num){
        if(num == 0){
            return num;
        }
        int numCopy = num;
        int countPlaces = 0;
        while(numCopy>0){
            countPlaces++;
            numCopy = numCopy /10;
        }
        //System.out.println(countPlaces);
        int places = 1;
        for(int i=0;i<countPlaces-1;i++){
            places *=10;
        }
        return num%10* places+ reverseInt2(num/10);



    }

    public static int reverseInt3(int num){
        if(num == 0){
            return num;
        }
        int multi = (int)Math.pow(10,(int)Math.log10(num));
        return num%10* multi+ reverseInt2(num/10);
    }


}
