package org.example.medium;

import java.util.*;

public class MajorityElement2 {

    public static void main(String[] args) {
        MajorityElement2 instance = new MajorityElement2();
    }
    public List<Integer> majorityElement(int[] nums) {
        if(nums.length==1) return new ArrayList<>(List.of(nums[0]));
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if((map.get(nums[i])+1)>(nums.length/3)&&!set.contains(nums[i])) {
                    set.add(nums[i]);
                    list.add(nums[i]);
                }else{
                    map.put(nums[i],map.get(nums[i])+1);
                }
            }else{
                if(1>(nums.length/3)){
                    set.add(nums[i]);
                    list.add(nums[i]);
                }
                map.put(nums[i],1);
            }
        }
        return list;
    }
}
