package org.example.leader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dominator {
    public static void main(String [] args){
        int [] tomb = { 1,2,3,2,3,5,6,2,6};
    }
    public static int solution(int[] tomb){
        if(tomb.length==0) return -1;
        Map<Integer, List<Integer>> myMap = new HashMap<>();
        for(int i=0;i<tomb.length;i++){
            if(!myMap.containsKey(tomb[i])){
                List<Integer> mylist = new ArrayList<>();
                mylist.add(i);
                myMap.put(tomb[i],mylist);
            }else{
                List<Integer> mylist ;
                mylist = myMap.get(tomb[i]);
                mylist.add(i);
                myMap.replace(tomb[i],mylist);
            }
        }
        Integer biggestSize=-1;
        List<Integer> mylist =new ArrayList<>();
        for (Map.Entry<Integer,List<Integer>> entry : myMap.entrySet()){
            if(entry.getValue().size()>biggestSize){
                mylist = entry.getValue();
                biggestSize =entry.getValue().size();
            }
        }
        if(mylist.size()>(tomb.length/2)){
            return mylist.get(0);
        }else{
            return -1;
        }
    }
}
