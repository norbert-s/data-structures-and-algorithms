package org.example.backtracking.combination;

import java.util.*;
import java.util.stream.Collectors;

public class CombinationSum {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    Set<LinkedList<Integer>> set = new HashSet<>();

    public static void main(String[] args) {
        CombinationSum combinationSum = new CombinationSum();
        int[] candidates = {8, 7, 4, 3};
        System.out.println(combinationSum.combinationSum(candidates, 11));

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.list = Arrays.stream(candidates).mapToObj(s -> Integer.valueOf(s)).collect(Collectors.toList());
        combinationSumReq(target, new LinkedList<>(), 0, 0);
        return res;
    }

    public void combinationSumReq(int target, LinkedList<Integer> curr, int index, int sum) {
        if (sum == target) {
            List<Integer> tempList = new ArrayList<>(curr);
            Collections.sort(tempList);
            System.out.println(tempList);

            if (!set.contains(tempList)) {
                set.add(new LinkedList<>(tempList));
                res.add(new ArrayList<>(curr));
            }
            return;
        } else if (index >= list.size()) {
            return;
        }
        for (int i = index; i < list.size(); i++) {
            if (sum <= target) {
                curr.add(list.get(i));
                sum += list.get(i);
                combinationSumReq(target, curr, index, sum);
                curr.removeLast();
                sum -= list.get(i);
            }
        }

    }


    int sumlist(List<Integer> list) {
        return list.stream().mapToInt(s -> Integer.valueOf(s)).sum();
    }

}
