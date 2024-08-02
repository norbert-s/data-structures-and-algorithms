package org.example.two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumTwo {

    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 9;
        TwoSumTwo twoSumTwo = new TwoSumTwo();
        Arrays.stream(twoSumTwo.twoSum(arr,target)).forEach(System.out::println);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int maradek = target - nums[i];
            if(map.containsKey(maradek)){
                return new int [] {map.get(maradek)+1,i+1};
            }
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }

        }
        return null;
    }
}
