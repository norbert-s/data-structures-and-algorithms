package org.example;

import java.util.*;

public class MinimumIndexSumOFTwoLists {
    public static void main(String[] args) {
       String [] list1 = {"Shogun","Tapioca Express","Burger King","KFC"},
        list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        //Arrays.stream(findRestaurant(list1,list2)).forEach(System.out::println);
    }

    //mine
    public static String[] _findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        Map<Integer, List<String>> map2 = new TreeMap<>();
        for(int j=0;j<list2.length;j++){
            if(map.containsKey(list2[j])){
                int sum = map.get(list2[j])+j;
                if(map2.containsKey(sum)){
                    map2.get(sum).add(list2[j]);
                }else{
                    map2.put(sum,new ArrayList<>(List.of(list2[j])));
                }
            }
        }

        Map.Entry<Integer, List<String>> entry = map2.entrySet().iterator().next();
        List<String> list= entry.getValue();
        return list.toArray(new String[list.size()]);
    }
}
