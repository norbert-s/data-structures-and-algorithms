package org.example.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        if(nums.length==1) return nums[0];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if((map.get(nums[i])+1)>(nums.length/2))
                    return nums[i];
                else{
                    map.put(nums[i],map.get(nums[i])+1);
                }
            }else{
                map.put(nums[i],1);
            }
        }
        return -1;
    }
}
