package org.example.single_number;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                set.remove(nums[i]);
            }
        }
        List<Integer> list = new ArrayList<>();
        set.stream().forEach(s->list.add(s));
        return list.get(0);
    }
}

