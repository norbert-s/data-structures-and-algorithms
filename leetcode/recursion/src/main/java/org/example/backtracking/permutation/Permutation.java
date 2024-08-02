package org.example.backtracking.permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Permutation {
    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> list= new ArrayList<>();

    public static void main(String[]args){
        int nums[] = {1,2,3};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        list = Arrays.stream(nums).mapToObj(s->Integer.valueOf(s)).collect(Collectors.toList());

        permuteReq(0,new ArrayList<>());

        return res;
    }

    public static void permuteReq(int index,List<Integer>curr) {
        if(index==list.size()){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index;i<list.size();i++){
            Collections.swap(list,i,index);

            permuteReq(index+1,list);

            Collections.swap(list,index,i);
        }
    }
}
