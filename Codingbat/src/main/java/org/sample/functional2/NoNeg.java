package org.sample.functional2;

import java.util.List;

public class NoNeg {
    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n->n<0);
        return nums;
    }

}
