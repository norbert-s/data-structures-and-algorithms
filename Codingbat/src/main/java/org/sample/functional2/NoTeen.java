package org.sample.functional2;

import java.util.List;

public class NoTeen {
    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n->n>=13 && n<=19);
        return nums;
    }
}
