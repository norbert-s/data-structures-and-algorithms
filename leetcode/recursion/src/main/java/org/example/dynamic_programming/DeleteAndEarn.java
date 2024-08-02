package org.example.dynamic_programming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DeleteAndEarn {

    public static void main(String[]args){
        DeleteAndEarn deleteAndEarn = new DeleteAndEarn();
        int [] nums={2,3,4};
        System.out.println(deleteAndEarn.deleteAndEarn(nums));
    }
    int nums[];
    Map<Integer,Integer> map;
    Map<Integer,Integer> cache=new HashMap<>();
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        this.nums=nums;
        int maxVal = 0;
        map = new ConcurrentHashMap<>();
        for(Integer i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        int counter =0;
        int [] previous = new int[map.size()];
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            //a previousben tároljuk a számot
            previous[counter] = entry.getKey();
            map.put(entry.getKey(), entry.getKey()* entry.getValue());
            counter++;
        }
        counter =0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(counter==0){
                cache.put(entry.getKey(),entry.getValue());
            }else{
                if(previous[counter-1]== entry.getKey()-1&&counter-2<=0){
                    cache.put(entry.getKey(), Math.max(cache.get(previous[counter-1]),entry.getValue()));
                }
                else if( previous[counter-1]== entry.getKey()-1){
                    cache.put(entry.getKey(),Math.max(cache.get(previous[counter-2])+entry.getValue(),cache.get(previous[counter-1])));
                }else{
                    cache.put(entry.getKey(),Math.max(cache.get(previous[counter-2])+entry.getValue(),cache.get(previous[counter-1])));
                }

            }
            maxVal = Math.max(maxVal,cache.get(entry.getKey()));
            counter++;
        }
        cache.forEach((k,v)->{
            System.out.println(k+" j "+v);
        });
        return maxVal;
    }
    int maxSum = 0;
}
