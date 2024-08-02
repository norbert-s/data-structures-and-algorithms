package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstuniqueCharacterInString {
    public static void main(String[]args){
        String str ="dddccdbba";
        System.out.println(firstUniqChar(str));
    }


    //mine accepted
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        Map<Character, Integer> map2 = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 2);
            } else {
                map2.put(s.charAt(i),i);
                map.put(s.charAt(i), 1);
            }
        }
        int j = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return map2.get(entry.getKey());
            }
            j++;
        }
        return -1;
    }
}
