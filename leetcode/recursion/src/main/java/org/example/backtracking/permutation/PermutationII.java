package org.example.backtracking.permutation;

import java.util.*;
import java.util.stream.Collectors;

public class PermutationII {
    public static void main(String[]args){
        int nums[] = {1,1,2};
        System.out.println(permuteUnique(nums));
    }
    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> list= new ArrayList<>();

    static Set<List<Integer>> set = new HashSet<>();

    public static List<List<Integer>> permuteUnique(int[] nums) {
        list = Arrays.stream(nums).mapToObj(s->Integer.valueOf(s)).collect(Collectors.toList());

        permuteReq(0,new ArrayList<>());

        return res;
    }

    public static void permuteReq(int index,List<Integer>curr) {
        if(index==list.size()){
            if(!set.contains(curr)){
                res.add(new ArrayList<>(curr));
                set.add(curr);
            }

            return;
        }
        for(int i=index;i<list.size();i++){
            Collections.swap(list,index,i);

            permuteReq(index+1,list);

            Collections.swap(list,index,i);
        }
    }
}
