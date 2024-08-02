package org.example;

import java.util.*;

public class TopKFrequent {

    public static void main(String[] args) {
        //int nums [] = {1,1,2,2,3,4,4,4};
        int [] nums = {5,3,1,1,1,3,73,1};

        int k = 1;
        Arrays.stream(topKFrequent(nums,k)).forEach(System.out::println);
    }

    //mine accepted
    public static int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);

        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer, List<Integer>> map2 = new TreeMap<>();
        for(Integer i:nums){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else{
                int val = map.get(i);
                map.put(i,val+1);
            }
        }
        map.forEach((key,value)->{
            System.out.println(key+" kdsadsdasdasd "+value);
        });
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(!map2.containsKey(entry.getValue())){
                map2.put(entry.getValue(), new ArrayList<>(List.of(entry.getKey())));
            }else{
                List<Integer> subList = map2.get(entry.getValue());
                subList.add(entry.getKey());
                map2.put(entry.getValue(),subList);
            }
        }
        map2.forEach((key,value)->{
            System.out.println(key+" kdsadsdasdasd "+value);
        });

        List<Integer> sorted = new ArrayList<>(map2.keySet());
        int [] tomb = new int [k];
        int j=0;
        int counter = 0;
        for(int i=sorted.size()-1;i>=0&&counter<=k;i--){
            List <Integer> subList = map2.get(sorted.get(i));
            for(int m=0;m<subList.size()&&counter<k;m++){
                tomb[j] = subList.get(m);
                j++;
                counter++;
            }

        }
        return tomb;
    }
}
