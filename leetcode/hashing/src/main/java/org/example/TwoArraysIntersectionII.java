package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TwoArraysIntersectionII {
    public static void main(String[]args){
        int []nums1 = {1,2,2,1}, nums2 = {2};
        //Arrays.stream(intersect(nums1,nums2)).forEach(System.out::println);

        ArrayList<Integer> list1 = (ArrayList<Integer>) Arrays.stream(nums1).mapToObj(s->Integer.valueOf(s)).collect(Collectors.toList());
        ArrayList<Integer> list2 = (ArrayList<Integer>) Arrays.stream(nums2).mapToObj(s->Integer.valueOf(s)).collect(Collectors.toList());
        list1.retainAll(list2);
        list1.forEach(System.out::println);
    }

    //mine accepted
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1 = new LinkedHashMap<>();
        for(int i:nums1){
            if(map1.containsKey(i)){
                map1.computeIfPresent(i,(k,v)->v+1);
            }else{
                map1.computeIfAbsent(i,v1->1);
            }
        }
        Map<Integer,Integer> map2 = new LinkedHashMap<>();
        for(int i:nums2){
            if(map2.containsKey(i)){
                map2.computeIfPresent(i,(k,v)->v+1);
            }else{
                map2.computeIfAbsent(i,v1->1);
            }
        }
        int counter =0;
        Map<Integer,Integer> map3 = new LinkedHashMap<>();
        for(Map.Entry<Integer,Integer> entry : map1.entrySet()){
            if(map2.containsKey(entry.getKey())){
                int minVal = Math.min(entry.getValue(),map2.get(entry.getKey()));
                map3.put(entry.getKey(),minVal);
                counter+=minVal;
            }
        }
        int [] tomb = new int[counter];
        int j=0;
        for(Map.Entry<Integer,Integer> entry : map3.entrySet()){
            for(int i=0;i<entry.getValue();i++){
                tomb[j] = entry.getKey();
                j++;
            }
        }

        return tomb;
    }


}
