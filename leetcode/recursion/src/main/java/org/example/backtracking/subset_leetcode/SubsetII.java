package org.example.backtracking.subset_leetcode;

import java.util.*;

public class SubsetII {
    public static void main(String[]args){
        int nums[]={1,2,2,2};
        System.out.println(subsetsWithDup(nums));
    }
    static int k;
    static List<List<Integer>> res=new ArrayList<>();
    static int [] arr;

    static Set<List<Integer>> set = new HashSet<>();
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        arr = nums;
        //Arrays.sort(arr);
        for(k=0;k< nums.length+1;k++){
            subsetsReq(0,new ArrayList<>());
        }
        return res;
    }

    public static void subsetsReq(int index, List<Integer> curr) {
        if(curr.size()==k){
            if(!set.contains(curr)){
                res.add(new ArrayList<>(curr));
                set.add(curr);
            }
            return;
        }
        for(int i=index;i<arr.length;++i){
            curr.add(arr[i]);
            subsetsReq(i+1,curr);
            curr.remove(curr.size()-1);
        }
    }


//    public static void subsetsReq(int index, List<Integer> curr) {
//        if(curr.size()==k){
//            if(!set.contains(curr)){
//                res.add(new ArrayList<>(curr));
//                set.add(curr);
//            }
//            return;
//        }
//        for(int i=index;i<arr.length;++i){
//            curr.add(arr[i]);
//            subsetsReq(i+1,curr);
//            curr.remove(curr.size()-1);
//        }
//    }

//    static public List<List<Integer>> subsetsWithDup(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> subsets = new ArrayList<>();
//        List<Integer> currentSubset = new ArrayList<>();
//
//        subsetsWithDupHelper(subsets, currentSubset, nums, 0);
//        return subsets;
//    }
//
//    static private void subsetsWithDupHelper(List<List<Integer>> subsets, List<Integer> currentSubset, int[] nums, int index) {
//        // Add the subset formed so far to the subsets list.
//        subsets.add(new ArrayList<>(currentSubset));
//
//        for (int i = index; i < nums.length; i++) {
//            // If the current element is a duplicate, ignore.
//            if (i != index && nums[i] == nums[i - 1]) {
//                continue;
//            }
//            currentSubset.add(nums[i]);
//            subsetsWithDupHelper(subsets, currentSubset, nums, i + 1);
//            currentSubset.remove(currentSubset.size() - 1);
//        }
//    }
}
