package org.example.arrays;

import java.util.HashMap;
import java.util.Map;

public class OddOccurences {
    public static void main(String[]args){
        int [] tomb = {3,5,3,9,9};
        int result= oddOcurence(tomb);

        System.out.println(result);
    }
    public static int oddOcurence(int[]tomb) {
        Map<Integer,Integer> myMap = new HashMap<>();
        if(tomb.length==1) return tomb[0];

        for(int i=0;i<tomb.length;i++){
            if(!myMap.containsKey(tomb[i])){
                myMap.put(tomb[i],1);
            }
            else{
                int currentValue = myMap.get(tomb[i]);
                System.out.println(" current value "+currentValue);
                myMap.replace(tomb[i],++currentValue);
            }
        }
        int foundValue = -9999;
        for (Map.Entry<Integer,Integer> entry : myMap.entrySet()){
            if(entry.getValue()%2==1) foundValue=entry.getKey();
        }
        return foundValue;
    }
}
