package org.example.backtracking.combination;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    List<List<Integer>> res = new ArrayList<>();

    int threshold =9;

    int target;

    int k;

    public static void main(String[] args) {
        CombinationSum3 combinationSum3 = new CombinationSum3();
        System.out.println(combinationSum3.combinationSum3(4, 1));
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        this.k = k;
        this.target = n;
        combinationSum3Rec(new ArrayList<>(),1,0);
        return res;
    }

    public void combinationSum3Rec(List<Integer>curr,int index,int sum) {
        if(curr.size()==k){
            if(sum==target){
                res.add(new ArrayList<>(curr));
                return;
            }
        }
        if(index>threshold){
            return;
        }
        for(int i=index;i<=threshold;i++){
            if(sum+i<=target){
                curr.add(i);
                sum += i;
                combinationSum3Rec(curr,i+1,sum);
                curr.remove(curr.size()-1);
                sum-=i;
            }
        }
    }
}
