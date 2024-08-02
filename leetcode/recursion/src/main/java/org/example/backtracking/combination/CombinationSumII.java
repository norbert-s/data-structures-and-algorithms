package org.example.backtracking.combination;

import java.util.*;
import java.util.stream.Collectors;

public class CombinationSumII {

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    Set<LinkedList<Integer>> set = new HashSet<>();



    public static void main(String[] args) {
        CombinationSumII combinationSum = new CombinationSumII();
        int[] candidates = {10,1,2,7,6,1,5};
        System.out.println(combinationSum.combinationSum2(candidates, 8));

    }


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.list = Arrays.stream(candidates).mapToObj(s -> Integer.valueOf(s)).collect(Collectors.toList());
        Collections.sort(list);
        combinationSumReq(target, new LinkedList<>(), 0, 0);
        return res;
    }

    public void combinationSumReq(int target, LinkedList<Integer> curr, int index, int sum) {
        if (sum == target) {
            res.add(new ArrayList<>(curr));
            return;
        } else if (index >= list.size()) {
            return;
        }
        for (int i = index; i < list.size(); i++) {
            if (sum <= target) {
                if(i>index&&list.get(i)==list.get(i-1))
                    continue;
                curr.add(list.get(i));
                sum += list.get(i);
                combinationSumReq(target, curr, i+1, sum);
                curr.removeLast();
                sum -= list.get(i);
            }
        }
    }

    // 172/176 test case passed- time limit exceeded
    public void combinationSumReq2(int target, LinkedList<Integer> curr, int index, int sum) {
        if (sum == target) {
            List<Integer> tempList = new ArrayList<>(curr);
            Collections.sort(tempList);
            //System.out.println(tempList);

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
                combinationSumReq(target, curr, i+1, sum);
                curr.removeLast();
                sum -= list.get(i);
            }
        }
    }
}
