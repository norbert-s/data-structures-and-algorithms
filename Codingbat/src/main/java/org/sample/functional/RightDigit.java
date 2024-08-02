package org.sample.functional;

import java.util.List;

public class RightDigit {
    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n-> Integer.valueOf(giveRightMostDigit(n)));

        return nums;
    }
    public int giveRightMostDigit(int num){
        String stringNumber = Integer.toString(num);

        char result = stringNumber.charAt(stringNumber.length()-1);
        return Character.getNumericValue(result);
    }


}
