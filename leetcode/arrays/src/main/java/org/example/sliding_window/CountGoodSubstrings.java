package org.example.sliding_window;

import javax.print.DocFlavor;
import java.util.*;

public class CountGoodSubstrings {


    public static void main(String[] args) {
        CountGoodSubstrings instance = new CountGoodSubstrings();
        System.out.println(instance.countGoodSubstrings("xyzzaz"));
    }
    //accepted
    public int countGoodSubstrings(String s) {
        if(s.length()<3) return 0;

        Set<Character> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for(int i=0;i<s.length()-2;i++){
            StringBuilder str = new StringBuilder();
            set.clear();
            for(int j=i;j<=i+2;j++){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                    str.append(s.charAt(j));
                }else{
                    break;
                }
            }
            if(str.length()==3){
                list.add(String.valueOf(str));
            }
        }
        return list.size();
    }
}
