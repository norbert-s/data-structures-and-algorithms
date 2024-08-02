package org.example.two_sum;

import javax.swing.*;
import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int nums [] = {0,0,0,0};
        System.out.println(threeSum.threeSum(nums));
    }
    //-4,-1,-1,0,1,2

    public List<List<Integer>> threeSum2(int[] nums) {
        Arrays.stream(nums);
        List<List<Integer>> res = new ArrayList<>();
//        Map<Integer,List<Integer>> map = new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//            if(!map.containsKey(nums[i])){
//                map.put(nums[i],new ArrayList<>(List.of(i)));
//            }else{
//                List<Integer> subList = map.get(nums[i]);
//                subList.add(i);
//            }
//        }
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            int sumOfTwo = (-1)*(nums[low]+nums[high]);
//            if()
            if(sumOfTwo>nums[low]){
                low++;
            }else{
                low--;
            }

        }
        return res;
    }

//
    int [] nums;
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> threeSum(int[] nums) {

        this.nums = nums;
        Arrays.sort(this.nums);
        threeSum(0,new ArrayList<>(),0);
        return res;
    }
    Set<List<Integer>> set = new HashSet<>();

    //time limit exceeded
    //308/312 passed
    public void threeSum(int index, List<Integer> curr, int sum) {
        if(index>=nums.length){
            if(curr.size()==3 && sum==0){
                if(!set.contains(curr)){
                    res.add(new ArrayList<>(curr));
                    set.add(curr);
                }
                return;
            }else{
                return;
            }
        }
        else if(curr.size()==3 && sum==0){
            if(!set.contains(curr)){
                res.add(new ArrayList<>(curr));
                set.add(curr);
            }
            return;
        }

        for(int i=index;i<nums.length&&curr.size()<3;i++){

            curr.add(nums[i]);
            sum += nums[i];
            threeSum(i+1,curr,sum);
            curr.remove(curr.size()-1);
            sum-= nums[i];
        }
    }
}
