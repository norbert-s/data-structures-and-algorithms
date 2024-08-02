package org.example.medium;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        System.out.println(threeSum.threeSum(new int[]{1,2,3}));
    }
    //308/312 passed
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sett2 = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int sum = nums[i];
            if(sum>0){
                break;
            }
            for (int j = i + 1; j < nums.length - 1; j++) {
                sum += nums[j];
                if(sum>0){
                    sum-=nums[j];
                    break;
                }
                int complementer = -1*sum;
                for (int k = nums.length-1; k >j; k--) {
                    //if(nums[k]>complementer) break;
                    sum += nums[k];
                    if(sum<0){
                        sum-=nums[k];
                        break;
                    }
                    if (sum == 0) {
                        List<Integer> set = new ArrayList<>(List.of(nums[i],nums[j],nums[k]));
                        if (!list.contains(set)) {
                            list.add(set);
                        }
                    }
                    sum-=nums[k];
                }
                sum-=nums[j];
            }
        }
        return list;
    }
    //308/312 passed
    public List<List<Integer>> threeSum2(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> sett= new HashSet<>();

        List<List<Integer>> list = new ArrayList<>();
        List<List<Integer>> list2 = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {

            if(sett.contains(nums)) continue;
            int sum = nums[i];
            if(sum>0){
                break;
            }
            sett.add(nums[i]);

            for (int j = i + 1; j < nums.length - 1; j++) {
                if(list2.contains(new ArrayList<>(List.of(nums[i],nums[j]))))continue;
                sum += nums[j];
                if(sum>0){
                    sum-=nums[j];
                    break;
                }

                int complementer = -1*sum;
                for (int k = nums.length-1; k >j; k--) {
                    if(nums[k]<complementer) break;
                    sum += nums[k];
                    if(sum<0){
                        sum-=nums[k];
                        break;
                    }
                    if (sum == 0) {
                        List<Integer> set = new ArrayList<>(List.of(nums[i],nums[j],nums[k]));
                        if (!list.contains(set)) {
                            list.add(set);
                        }
                    }
                    sum-=nums[k];
                }
                sum-=nums[j];
                list2.add(new ArrayList<>(List.of(nums[i],nums[j])));
            }
        }
        return list;
    }
}
