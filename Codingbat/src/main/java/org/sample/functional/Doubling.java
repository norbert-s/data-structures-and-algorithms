package org.sample.functional;

import java.util.List;

public class Doubling {
    public List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n->n*2);
        return nums;
    }

}
