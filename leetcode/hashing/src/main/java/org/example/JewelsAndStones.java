package org.example;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        Set<String> set = new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            set.add(String.valueOf(jewels.charAt(i)));
        }
        int counter = 0;
        for(int j=0;j<stones.length();j++){
            if(set.contains(String.valueOf(stones.charAt(j)))){
                counter++;
            }
        }
        return counter;
    }
}
