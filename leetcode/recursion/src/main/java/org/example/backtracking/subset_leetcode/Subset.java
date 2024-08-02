package org.example.backtracking.subset_leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[]args){
        Subset subset = new Subset();

        int nums[]={1,2,3};
        System.out.println(subset.subsets(nums));
    }
    int k;
    List<List<Integer>> res=new ArrayList<>();
    int [] arr;
    public List<List<Integer>> subsets(int[] nums) {
        arr = nums;
        for(k=0;k< nums.length+1;k++){
            subsetsReq(0,new ArrayList<>());
        }
        return res;
    }
    public void subsetsReq(int index, List<Integer> curr) {
        if(curr.size()==k){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index;i<arr.length;++i){
            curr.add(arr[i]);
            subsetsReq(i+1,curr);
            curr.remove(curr.size()-1);
        }
    }


//    public static void main(String[]args){
//        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
//        System.out.println(subsets(nums));
//    }
//    static int k;
//    static List<List<Integer>> res=new ArrayList<>();
//    static int [] arr;
//    public static List<List<Integer>> subsets(int[] nums) {
//        arr = nums;
//        for(k=1;k< arr.length+1;k++){
//            subsetsReq(0,new ArrayList<>(),0);
//        }
//        return res;
//    }
//    static int maxSum = Integer.MIN_VALUE;
//    public static void subsetsReq(int index, List<Integer> curr,int sum) {
//        if(curr.size()==k){
//            if(sum>maxSum){
//                maxSum = sum;
//                res.add(new ArrayList<>(curr));
//                return;
//            }
//        }
//        if(index>=arr.length)return;
//        for(int i=index;i<arr.length;++i){
//            int orig = arr[i];
//            curr.add(orig);
//            sum = sum+arr[i];
//            subsetsReq(i+1,curr,sum);
//            curr.remove(curr.size()-1);
//            sum = sum-orig;
//        }
//    }
}
