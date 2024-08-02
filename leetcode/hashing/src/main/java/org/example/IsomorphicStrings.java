package org.example;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static void main(String[]args){
        String str1 = "asdfg";
        String str2 = "sdfgh";
       // isIsomorphicTransformation(str1,str2);


    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        Map<String,Integer> map = new HashMap<>();
        int [] arr = new int [s.length()];
        Map<String,Integer> map2 = new HashMap<>();
        int [] arr2 = new int [t.length()];
        for(int i=0;i<s.length();i++){
            String subS = String.valueOf(s.charAt(i));
            String subS2 = String.valueOf(t.charAt(i));
            if((map.containsKey(subS)&&!map2.containsKey(subS2))||(!map.containsKey(subS)&&map2.containsKey(subS2))){
                return false;
            }
            else if((map.containsKey(subS)&&map2.containsKey(subS2))){
                int putItHere1 = map.get(subS);
                int putItHere2 = map2.get(subS2);
                arr[i] = putItHere1;
                arr2[i] = putItHere2;
            }

            else{
                map.put(subS,i);
                arr[i] = i;
                //------------------
                map2.put(subS2,i);
                arr2[i] = i;
            }
        }
        for(int j=0;j<t.length();j++){
            if(arr[j]!=arr2[j])return false;
        }

        return true;
    }
}
